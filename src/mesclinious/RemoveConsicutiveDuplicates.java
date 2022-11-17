package mesclinious;
import java.util.Scanner;
public class RemoveConsicutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeConsicutive(str));
    }
    public static String removeConsicutive(String str){
        String cr="";
        int j =1;
        for (int i =0; i < str.length()-1&&j<str.length(); i+=1,j++) {
            if (str.charAt(i)!=str.charAt(j)){
                cr+=str.charAt(j);
            }

        }
        return cr;

    }
}
