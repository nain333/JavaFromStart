package mesclinious;
import java.util.Scanner;
public class TakeInputOfAMatrixAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cools");
        int cols = sc.nextInt();
        int mat[][]=takeInput(rows,cols);
        printMatrix(mat);
        rowWiseSum(mat);
        sumonboundariesanddiagonals(mat);
        printBoundary(mat);
        sumODiagonal(mat);


    }
    public static int[][] takeInput(int rows, int cols){
        Scanner sc = new Scanner(System.in);
        int [][] m = new int[rows][cols];
        for (int i = 0; i <m.length ; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("Enter the  element at indices: ("+i+","+j+")");
                m[i][j]=sc.nextInt();
            }

        }
        return m;


    }
    public static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }
    }
    public static int rowWiseSum(int arr[][]){
        int max = Integer.MIN_VALUE;
        int mxdx=-1;
        boolean isRow=true;

        for (int i = 0; i <arr.length ; i++) {
            int sum = 0;
            int cs = 0;

            for (int j=0; j < arr[0].length; j++) {
                sum += arr[i][j];
                cs += arr[j][i];


            }
            if(sum>max){
                isRow=true;
                max=sum;
                mxdx=i;
            }
            if(cs>max){
                isRow=false;
                max=cs;
                mxdx=i;

            }

        }
        if (!isRow){

            System.out.println("col"+mxdx);
        }
        if (isRow){
            mxdx++;
            System.out.println("row"+mxdx);
        }

        return mxdx;

    }
    public static int sumonboundariesanddiagonals(int[][]arr){
        int sum = 0;
        int m = arr.length-1;
        int n = arr[0].length-1;
        int k = n;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length&&k>=0; j++) {
//                principal digonal.
               sum+=arr[i][i];
//               secondary diagonal
//                sum+=arr[i][k--];

            }



        }
        System.out.println(sum);
        return sum;
    }
    public static void printBoundary(int arr[][]) {
        int m = arr.length-1;
        int sum = 0;
        int k =m;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length&&k>0; j++) {
                if (i==0||i==m||j==0||j==m||i==j){
                    System.out.print(arr[i][j]);
                    sum+=arr[i][j];



                }
                else System.out.print(" ");
//                if(i==j){
//                    sum+=arr[i][j];
//                }
            }
            System.out.println();
        }
//        Secendory Diagonal Sum:

        System.out.println(sum);
    }
    public static int sumODiagonal(int matrix[][]){
        int sum = 0;
        int n = matrix.length;
        int k=n-1;
        for (int i = 0; i < matrix.length&&k>=0; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum+=matrix[i][k--];

            }

        }
        System.out.println("Diag sum:"+sum);
        return sum;
    }
}
