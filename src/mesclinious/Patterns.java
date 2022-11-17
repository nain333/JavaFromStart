package mesclinious;

import java.util.Scanner;

public class Patterns {
    public static void diamondOfStars(int n){
        int p =1;
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <=n-i ; space++) {
                System.out.print(" ");

            }

            for (int stars = 1 ;  stars<= i; stars++) {
                System.out.print("*");
                p++;



            }
            for (int left=1; left<=i-1;left++){
                System.out.print("*");
            }
            System.out.println();


            }
        for (int i = 1; i <=n-1 ; i++) {
            for (int spaces =1; spaces<=i; spaces++){
                System.out.print(" ");
            }
            for (int stars = 1; stars <=n-i;  stars++) {
                System.out.print("*");
            }
            for (int ls = 1; ls <=n-i-1 ; ls++) {
                System.out.print("*");

            }
            System.out.println();

        }






        }





    public static void tringularPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
    public static void simplePattern(int n){
        for (int i =0; i<n; i++){
            for (int j = 0; j <n ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        simplePattern(n);
        tringularPattern(n);
        diamondOfStars(n);
    }
}
