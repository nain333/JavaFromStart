package mesclinious;
import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class PopulateArray {
    public static void inssort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static int [] populateArray(int n){
        int arr[]=new int[n];
        int k=1;
        for (int i = 0,j=arr.length-1; i <=j ; ) {
            if (k%2==0){
                arr[j--]=k++;
            }
            else {
                arr[i++]=k++;
            }

        }
        return arr;
    }
    public static void printArray(int arr[]){
        System.out.print(System.currentTimeMillis()+"{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");


        }
        System.out.print("}"+" "+ System.currentTimeMillis());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int arr[]=populateArray(n);
//        inssort(arr);
        Arrays.sort(arr);
        printArray(arr);


    }
}
