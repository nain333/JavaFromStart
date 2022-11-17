package RecurssionOnStringsAss;
import java.util.Scanner;
public class codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.next();
        String output[] = getCode(input);
        printString(output);

    }
    public static char getchar(int n){

            return (char)(96+n);



    }
    public static String[] getCode(String input){
        if (input.length()==0){
            String[] output={""};
            return output;
        }
        int firstDigit=(input.charAt(0)-'0');
        String[] smallOutput1=getCode(input.substring(1));
        String[] smallOutput2=new String[0];
        int firstTwoDigits=0;
        if (input.length()>=2){
            firstTwoDigits=(input.charAt(0)-'0')*10+(input.charAt(1)-'0');
            if (firstTwoDigits>10&&firstTwoDigits<=26){
                smallOutput2=getCode(input.substring(2));

            }
        }
        String[] output=new String[smallOutput1.length+smallOutput2.length];
        int k =0;
        for (String s: smallOutput1){
            char firstDigitChar=getchar(firstTwoDigits);
            output[k++]=firstDigitChar+s;
        }
        for (String s: smallOutput2){
            char firstTwoDigitChar=getchar(firstTwoDigits);
            output[k++]=firstTwoDigitChar+s;
        }
        return  output;
    }
    public static void printString (String output[]){
        for(String s : output){
            System.out.print(s+" ");

        }
        System.out.println();
    }




}
