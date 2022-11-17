package Recursion2;
import java.util.Scanner;
public class RemoveConsicutiveDuplicates {
    public static String RemoveConsDep(String str){
        if (str.length()<=1){
            return str;

        }
        String  smallAns="";
        if (str.charAt(0)!=str.charAt(1)){
            smallAns=smallAns+str.charAt(0);
        }
        return smallAns+RemoveConsDep(str.substring(1));

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

        String str = sc.next();
        System.out.println(RemoveConsDep(str));    }
}
