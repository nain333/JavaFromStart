package mesclinious;
import com.sun.jdi.IntegerValue;

import java.util.Scanner;
public class CheckStringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 =sc.next();
        String str2=sc.next();
        System.out.println(checkPermutation(str1,str2));
        System.out.println(permutrec(str1,str2));



    }
    public static boolean checkPermutation(String str1,String str2) {
         if(str1.length() != str2.length()){
             return false;
         }

         int str1sum=0,str2sum=0;


        for (int i = 0,j=0; i < str1.length()&&j<str2.length(); i++,j++) {
            str1sum+= str1.charAt(i);
            str2sum+=str2.charAt(j);

        }
        return (str1sum==str2sum?true:false);

    }
    public static boolean permutrec(String str,String str2){
        if (str.length()!=str2.length()){
            return false;
        }
        int sum1=sum(str,0,str.length()-1);
        int sum2=sum(str2,0,str2.length()-1);
        System.out.println(sum1);
        return (sum1==sum2?true:false);
    }
    public static int sum(String str,int si,int ei){

        if(si>=ei){
            return (str.charAt(ei));
        }


        return sum(str,si+1,ei)+str.charAt(si);

    }
}
