package Recursion3;
import java.util.Scanner;
public class ReturnAllKeypadCombinations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in
        );
        int n = sc.nextInt();
        String arr[]=getStringCombinations(n);
        printString(arr);

    }
    public static String[] getStringCombinations(int n){
        if (n == 0) {
            String[] ret = {""};
            return ret;
        }
        int ld= n%10;
        String[] options=getKeys(ld);
        String[] sans=getStringCombinations(n/10);
        String ans[]=new String[options.length*sans.length];
        int k =0;
        for (int i = 0; i < options.length; i++) {
            for (int j = 0; j < sans.length; j++) {
                ans[k++]=sans[j]+options[i];

            }

        }
        return ans;
    }
    public static String[] getKeys(int n){
        if (n==2){
            String [] options = {"a","b","c"};
            return options;
        } else if (n==3) {
            String[] options={"d","e","f"};
            return options;

        } else if (n==4) {
            String[] options = {"g","h","i"};
            return options;
        } else if (n==5) {
            String[] options= {"j","k","l"};
            return options;
        } else if (n==6) {
            String options[]={"m","n","o"};
            return options;

        } else if (n==7) {
            String options[]={"p","q","r","s"};
            return options;

        } else if (n==8) {
            String options[]={"t","u","v"};
            return options;
        } else if (n==9) {
            String options[]={"w","x","y","z"};
            return options;

        }



        String options[]={" "};
        return options;


    }
    public static void printString(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
