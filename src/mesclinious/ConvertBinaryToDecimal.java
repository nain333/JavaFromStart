package mesclinious;

import java.util.*;
import java.lang.*;
// Recursive Java program to convert binary
// decimal



public class ConvertBinaryToDecimal {
    public static long getConversion(int n){
        long bin=0;
        int comparisons=0;
        for (int i = n; i >0 ; i/=10) {
            int ld=i%10;
            bin = (int) (Math.pow(2,comparisons)*ld+bin);
            comparisons++;


        }

        return bin;
    }
    public static long getConversion(String str){
        long bin =0;
        int comparison=0;
        long num[]= new long[str.length()];
        //complemt if negative

        for (int i = 0; i < str.length(); i++) {
            num[i]=Integer.parseInt(String.valueOf(str.charAt(i)));

        }
        for (int i = num.length-1; i >=1 ; i--) {
            long ld = num[i];
            bin=(long)Math.pow(2,comparison)*ld+bin;
            comparison++;

        }
        if (num[0]==1){
            return -bin;

        }
        else return  bin;



        }
        public static long recbin(String str, int si) {
//        if (si==str.length()-1) {
//            return str.charAt(si) -'0';
//        }
//            return ((str.charAt(si)-'0')<<(str.length()-1)-si)+ recbin(str,si+1);
//
//        }
            if (si == str.length() - 1) {
                return str.charAt(si) - '0';
            }
            return recbin(str, si + 1) + (long) ((str.charAt(si) - '0') * Math.pow(2, (str.length() - 1) - si));
        }


    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Note: First bit will be considered as sign bit");
        String n=sc.next();
        System.out.println(getConversion(n));
//        String text="233333";
//        long res =testFun(text);
//        System.out.println(res);
        double ans= recbin(n,0);
        System.out.println(ans);








    }
}
// Recursive Java program to convert binary
// decimal


class GFG
{
    static int toDecimal(String binary,int i)
    {
        // If we reached last character
        int n = binary.length();
        if (i == n-1)
            return binary.charAt(i) - '0';

        // Add current tern and recur for
        // remaining terms
        return ((binary.charAt(i) - '0') << (n-i-1)) +
                toDecimal(binary, i+1);
    }

    // Driver code
    public static void main(String []args)
    {
        String binary = "1010";
        int i=0;
        System.out.println(toDecimal(binary,i));

    }

}

// This code is contributed
// by ihritik ( Hritik Raj)

