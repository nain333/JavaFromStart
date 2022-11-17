package mesclinious;

import java.util.Scanner;

public class TermsOfAP {
    public static void termOfApRec(int n){

    }
    public static void termsOfAp(int n){
        int count=1;
        int i =1;
        System.out.print("{ ");

        while(count<=n){
            int term =(3*i)+2;
            i++;
            if (term%4==0){
                continue;
            }

            else{
                System.out.print(term+", ");
                count ++;
            }
        }
        System.out.print("}");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        termsOfAp(n);
    }
}
