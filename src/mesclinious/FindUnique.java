package mesclinious;

import java.util.Arrays;

public class FindUnique {
    public static int findUniqueOptimally(int arr[]) {
        {
            Arrays.sort(arr);

            for (int i = 0, j = 1; i < arr.length  && j < arr.length; i += 2, j += 2) {
                if (arr[i] != arr[j]) {
                    return arr[j];
                }

            }

        }
        return -1;
    }

    public static int finduni(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int j =0;
            for (; j<arr.length-1; j++){
                if (j!=i){
                    if (arr[i]==arr[j]){

                        break;
                    }
                }
            }
            if (j==arr.length-1){
                return arr[i];
            }



        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,2,1};
//        System.out.println( finduni(arr));
        System.out.println(findUniqueOptimally(arr));

    }
}
