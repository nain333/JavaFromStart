package mesclinious;

import javax.management.StringValueExp;
import java.util.Scanner;

public class DecimaltoBinary {

    public static int binarytodec(int n){
        int pv=1;
        int num=0;
        for (int i = n; i >0 ; i/=2) {
            int rem=i%2;
            num+=rem*pv;
            pv*=10;


        }
        return  num;
    }
    public static int dectob(int n,int pv){
        if (n<=0){
            return 0;
        }
        int rem=n%2;
        int dec= (int)(rem*Math.pow(10,pv));




            int ans= dec+dectob(n/2,pv+1);
            return ans;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(binarytodec(n));
        int ans = dectob(n,0);
        System.out.println(ans);
    }
}
