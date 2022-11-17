package mesclinious;
import java.util.Scanner;


public class ReverseWordWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= new String(sc.nextLine());
        System.out.println(str);
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        String rev="";

        for ( int i=0 ; i < str.length(); i++) {
            rev=str.charAt(i)+rev;
        }
        rev=rev+" ";

        // reverse the reversed string word wise.

        int ws =0;
        int we=0;
        String revstr="";
        int i = 0;
        for (; i < str.length(); i++) {
            // identify the delemeter.

            if (rev.charAt(i)==' '){
                we=i-1;

//                reverse the word.
                for (int j = we; j >=ws ; j--) {
                    revstr+=rev.charAt(j);

                }
                revstr+=" ";
                ws=i+1;
            }



        }
        we=i-1;
        for (int j = we; j >=ws ; j--) {
            revstr+=rev.charAt(j);

        }

        return revstr;
    }
}
