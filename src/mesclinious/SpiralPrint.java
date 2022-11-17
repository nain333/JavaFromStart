package mesclinious;

public class SpiralPrint {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//        printSpiral(arr);
        sp(arr);
        ps(arr);
    }
    public static void printSpiral(int [][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int cs=0,ce=n-1,rs=0,re=m-1,count=0;
        while (count<m*n){
            for (int i = cs; count<m*n&&i <=ce ; i++) {
                System.out.println(arr[rs][i]);
                count++;





            }
            rs++;
            for (int i =rs ; count<m*n&&i <re ; i++) {
                System.out.println(arr[i][ce]);
                count ++;

            }
            ce--;
            for (int i = ce; count<m*n&&i >=cs ; i--) {
                System.out.println(arr[re][i]);
                count ++;
                
            }
            re--;
            for (int i = re; count<m*n&&i >=rs ; i--) {
                System.out.println(arr[i][cs]);
                count ++;
            }
            cs++;



        }
    }
    public static void sp(int [][] mat){
        int nRows=mat.length;
        if (nRows==0){
            return;
        }
        int mcols=mat[0].length;
        int i , rs=0,cs=0,nele=nRows*mcols,count=0;
        while (count<nele){
            for ( i = cs; count <nele&&i<mcols ; i++) {
                System.out.print(mat[rs][i]+" ");
                count++;

            }
            rs++;
            for (i=rs; count<nele&&i<nRows;i++){
                System.out.print(mat[i][mcols-1]+" ");
                count ++;
            }
            mcols--;
            for (i=mcols-1;count<nele&&i>=cs;i--){
                System.out.print(mat[nRows-1][i]+" ");
                count ++;
            }
            nRows--;
            for(i=nRows-1;count<nele&&i>=rs;i--){
                System.out.print(mat[i][cs]);
                count++;
            }
            cs++;
        }
    }
    public static void ps(int[][] mat){
        int m = mat.length-1;
        int n =mat[0].length-1;
        int count=0,rs=0,re=m,cs=0,ce=n,ele=(m+1)*(n+1);
        while(count<(m+1)*(n+1)){
//            first row:
            for (int i = cs; i <=ce&&count<ele ; i++) {
                System.out.println(mat[rs][i]);
                count++;
            }
            rs++;
            for (int i = rs; i <=re&&count<ele ; i++) {
                System.out.println(mat[i][ce]);
                count++;
            }
            ce--;
            for (int i = ce; i >=cs && count<ele; i--) {
                System.out.println(mat[re][i]);
                count++;

            }
            re--;
            for (int i = re; i >=rs && count<ele; i--) {
                System.out.println(mat[i][cs]);
                count++;
            }
            cs++;
        }

    }
}
