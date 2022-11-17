package mesclinious;

public class PrintLikeWave {
    public static void main(String[] args) {
        int[][]mat= {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
        printWave(mat);


    }
    public static void printWave(int mat[][]){
        for (int i = 0; i < mat[0].length; i++) {
           if (i%2==0){
               for (int j = 0; j < mat.length; j++) {

                       System.out.print(mat[j][i]);


               }

            }
           else {
               for (int j = mat.length-1; j >=0 ; j--) {
                   System.out.print(mat[j][i]);
               }
           }

        }
    }


}
