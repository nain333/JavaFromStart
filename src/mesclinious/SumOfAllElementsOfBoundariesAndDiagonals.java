package mesclinious;
import java.util.Scanner;
public class SumOfAllElementsOfBoundariesAndDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int boundSum=sumOfDiagonals(mat);
        System.out.println(boundSum);


    }
    public static int sumOfDiagonals(int arr[][]){
        int sum = 0;
        int  m = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
//                on bounds,diagonals
                if (i==j||m==i+j||i==0||j==0||j==m||i==m){
                    sum+=arr[i][j];
                }
//
            }
        }

        return sum;
    }
}
