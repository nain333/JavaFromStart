package Recurssion_1_assignment;

import java.util.Scanner;

public class Cout0 {
    public static int count0(int n){
        if(n<10) {
            if (n == 0) {
                return 1;

            }
            else{
                return 0;
            }
        }
        if (n%10==0){
            return count0(n/10)+1;

        }
        else {
            return count0(n/10);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zeros= count0(n);
        System.out.println(zeros);
    }
}
