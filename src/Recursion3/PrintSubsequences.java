package Recursion3;
import java.util.*;
public class PrintSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSubsequences(str);
    }
    public static void printSubsequences(String input ,String  output){
        if (input.length()==0){
            System.out.println(output);
            return;
        }
//        don't add the current character:

//        add the current character:
        printSubsequences(input.substring(1),output+input.charAt(0));

        printSubsequences(input.substring(1),output);
    }
    public static void printSubsequences(String str){
        String output="";
        printSubsequences(str,output);
    }
}
