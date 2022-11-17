package mesclinious;
import java.util.Scanner;
public class CheckPalindrome {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkPalindrome(str));
    }
    public static boolean checkPalindrome(String str){
        return checkPalindrome(str,0,str.length()-1);
    }
    public static boolean checkPalindrome(String str, int si, int ei){
        if (si>=ei){
            return true;
        }
        if (str.charAt(si)!=str.charAt(ei)){
            return false;
        }
        return checkPalindrome(str, si+1,ei-1);
    }
}
