package mesclinious;
import java.util.*;

public class FindPower {
    public static int findPowRec(int x, int n){
        if (n==0){
            return 0;
        }
        if (x==0){
            return 1;

        }
        return n*findPowRec(x-1,n);
    }
    public static int findPow(int n , int x){
        int pow=1;
        for (; n>0; n--){
            pow*=x;

        }
        return  pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(findPow(n,x));
        System.out.println(findPowRec(n,x));



    }
}
