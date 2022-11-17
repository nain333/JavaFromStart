package RecurssionOnStringsAss;
import java.util.Scanner;
/*public class ReturnAllCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] output = getCode(input);
        printString(output);
    }
    public static void printString(String[] output){
        for (int i = 0; i <output.length ; i++) {
            System.out.println(output[i]);

        }

    }
    public static String[] getCode(String input){
        if (in put.length()==0){
            String output[]={""};
            return output;
        }
        int firstdigit=input.charAt(0)-'0';
        char key1=keys(firstdigit);
        String[]output1=getCode(input.substring(1));
        String[] output2=new String[0];
        for (int i = 0; i < output1.length; i++) {
            output1[i]=key1+output1[i];

        }
        if (input.length()>=2){
            int firstTwoDigits=input.charAt(0)*10+input.charAt(1);
            if (firstTwoDigits>10&&firstTwoDigits<=26){
                char key2=keys(firstTwoDigits);
                output2=getCode(input.substring(2));
                for (int i = 0; i < output1.length; i++) {
                    output2[i]=key2+output2[i];

                }




                }



        }
        String output[]=new String[output1.length+ output2.length];
        int k=0;
        for (int i = 0; i < output1.length; i++) {
            output[k++]=output[i];

        }
        for (int i = 0; i < output2.length; i++) {
            output[k++]=output2[i];
        }




    return output;
    }
    public static char keys(int n){
        return (char)(96+n);
    }

}*/

 class Codes{
    public static void main(String ars[]){
        System.out.println("Please Enter the numeric String: ");
        Scanner sc = new Scanner(System.in);
        String input= sc.next();
        String[] output=getCodes(input);
        printString(output);

    }
    public static void printString(String[] output){
        for (int i = 0; i<output.length; i++){
            System.out.print(output[i]+" ");
        }
        System.out.println();
    }
    public static String[] getCodes(String input){
        if(input.length()==0){
            String output[]={""};
            return output;
        }
        int firstDigit=input.charAt(0)-'0';
        String output1[]=getCodes(input.substring(1));
        String output2[]=new String[0];
        int firstTwoDigit=0;
        if(input.length()>=2){
            int firstTwoDigits=(input.charAt(0)-'0')*10+(input.charAt(1)-'0');
            if(firstTwoDigits>=10&&firstTwoDigits<=26){
                output2=getCodes(input.substring(2));
            }
        }
        String output[]= new String[output1.length+output2.length];
        int k =0;
//        for(int i=0; i<output1.length; i++){
//            output[k++]=getChar(firstDigit)+output1[i];
//        }
//        for(int j =0; j<output2.length; j++){
//            output[k++]=getChar(firstTwoDigit)+output2[j];
//        }
        for (String s:output1){
            char ch=getChar(firstDigit);
            output[k]=ch+s;
            k++;
        }
        for (String s : output2){
            char ch=getChar(firstTwoDigit);
            output[k]=ch+s;
            k++;
        }
        return output;

    }


    public static char getChar(int n){
        return (char)(96+n);
    }

}











