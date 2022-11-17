package Recurssion_1_assignment;

import java.util.Scanner;


public class Multiplication_reccursively {
    public static int multiplication(int m, int n){
        if (m==0||n==0){
            return 0;
        }
        return m*multiplication(m,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        int n = sc.nextInt();
        int mul=multiplication(m,n);
        System.out.println(mul);
    }
}
