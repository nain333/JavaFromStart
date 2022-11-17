package Recursion3;
import java.util.Scanner;
public class PrintKeypadCombinations {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Please Enter the number: ");
        int n = scn.nextInt();
        printAllCombo( n);
    }
    public static void printAllCombo(int n){
        printAllCombo(n,"");
    }
    public static void printAllCombo(int n, String output){
        if (n==0){
            System.out.println(output);
            return;
        }
        int lastdigit=n%10;
        String options=getKeys(lastdigit);

        for (int i = 0; i < options.length(); i++) {
            printAllCombo(n/10,options.charAt(i)+output);

        }



    }
    public static String getKeys(int n){
        if (n==2){
            String  options = "abc";
            return options;
        } else if (n==3) {
            String options="def";
            return options;

        } else if (n==4) {
            String options = "ghi";
            return options;
        } else if (n==5) {
            String options= "jkl";
            return options;
        } else if (n==6) {
            String options="mno";
            return options;

        } else if (n==7) {
            String options="pqrs";
            return options;

        } else if (n==8) {
            String options="tuv";
            return options;
        } else if (n==9) {
            String options="wxyz";
            return options;

        }



        String options=" ";
        return options;


    }
}
