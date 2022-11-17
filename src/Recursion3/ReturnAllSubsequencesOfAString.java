package Recursion3;
import java.util.Scanner;
public class ReturnAllSubsequencesOfAString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("The string is: "+ str);
        String getString[]= getsubsequences(str);
        System.out.println(getString);
        printString(getString);
    }
    public static void printString(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static String[] getsubsequences(String str){
        if (str.length()==0){
            String[] ans={""};
            return ans;
        }
        String smallans[]=getsubsequences(str.substring(1));
        String ans[]=new String[smallans.length*2];
        int k = 0;
        for (int i = 0; i < smallans.length; i++) {
            ans[k++]=smallans[i];

        }

        for (int i = 0; i <smallans.length ; i++) {
            ans[k++]=smallans[i]+str.charAt(0);

        }
        return ans;

    }
}
