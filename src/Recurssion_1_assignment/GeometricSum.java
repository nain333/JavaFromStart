package Recurssion_1_assignment;

import java.util.Scanner;

public class GeometricSum {
    public static double gSum(int k){
        if (k==0){
            return 1;
        }
        return gSum(k-1)+1/ Math.pow(2,k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k =sc.nextInt();
        double gs = gSum(k);
        System.out.println(gs);

    }
}
