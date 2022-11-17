package StringsAss;
import java.util.Scanner;
public class ReturnSubsetsSumToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[]arr= takeInput(n);
        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();
        int [][]subset= returnSubsetK(arr,k);
        printSubset(subset);
    }
    public static int[] takeInput(int n){
        Scanner scn= new Scanner(System.in);
        int[] input= new int[n];
        for (int  i =0; i<input.length; i++){
            System.out.println("Enter Element at possition: "+ i);
            input[i]=scn.nextInt();
        }
        return input;
    }
    public static void printSubset(int [][] subset){
        for (int i = 0; i < subset.length; i++) {
            System.out.print("{");
            for (int j = 0; j < subset[i].length; j++) {
                System.out.print(subset[i][j]+", ");

            }
            System.out.println("}");
            System.out.println();

        }
    }
    public static int[][] returnSubsetK(int[] arr , int k){
        return returnSubsetK(arr,k,0);
    }
    public static int[][] returnSubsetK(int [] input,int k , int si){
        if (si==input.length) {
            if (k == 0) {
                int[][] out = new int[1][0];
                return out;
            }
            else {
                int [][] out = new int[0][0];
                return out;
            }
        }
//        si is not the part of the subset
        int [][] temp1= returnSubsetK(input,k,si+1);
        int[][] temp2= returnSubsetK(input,k-input[si],si+1);
        int l = 0;
        int[][] out = new int[temp1.length+temp2.length][];
        for (int i = 0; i < temp1.length; i++) {
            out[l]= new int[temp1[i].length];
            for (int j = 0; j < temp1[i].length; j++) {
                out[l][j]= temp1[i][j];
            }
            l++;


        }
        for (int i = 0; i < temp2.length; i++) {
            out[l]= new int[temp2[i].length+1];
            out[l][0]=input[si];
            for (int j = 1; j < temp2[i].length+1 ; j++) {
                out[l][j]=temp2[i][j-1];
            }
            l++;

        }
        return out;


    }

}
