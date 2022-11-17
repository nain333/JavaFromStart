package mesclinious;
import java.util.*;

public class SumOrProduct {
    public static int findSumOrProductRec(int n , int c){
//        int s =n;
//        if (s==0){
//            return 0;
//        }
        if (n<=1){
            return 1;

        }
        int pr=findSumOrProductRec(n-1,c)*n;
        int sm=findSumOrProductRec(n-1,c)+n;
        if (c==1){
            return sm;
        } else if (c==2) {
            return pr;

        }
        else return -1;
    }
    public static int sumOrProduct(int n,int c){
        int sum=0,product=1;
        for (int i = 1; i <= n; i++) {
            sum+=i;
            product*=i;


        }
        if (c==1){
            return sum;
        }
        else if(c==2){
            return product;
        }
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int ans= sumOrProduct(n,c);
        System.out.println(ans);
        int rans= findSumOrProductRec(n,c);
        System.out.println(rans);

    }
}
