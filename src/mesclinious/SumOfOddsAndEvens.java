package mesclinious;
import java.util.*;
public class SumOfOddsAndEvens {
    public static int[] sumOfEvenOdd(int n){
        int sumEven=0;
        int sumOdd=0;
        for (; n>0; n/=10) {
            int lastDig=n%10;
            if (lastDig%2==0){
                sumEven+=lastDig;
            }
            else {
                sumOdd+=lastDig;
            }




        }
        int arr[]=new int[2];
        arr[0]=sumEven;
        arr[1]=sumOdd;
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=sumOfEvenOdd(n);
        System.out.println("Evem Sum: "+arr[0]);
        System.out.println("Odd sum: "+ arr[1]);





    }
}
