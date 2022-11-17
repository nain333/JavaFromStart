package mesclinious;

import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.max;

public class ArrayInt {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,3,4};
        int arr2[]={3,4,2,3,4,3,4};
//        arrInt(arr,arr2);
        int arr3[]={2,6,1,2};
        int arr4[]={1,2,3,4,2};
//        arrInt(arr3,arr4);
        arrayintersection(arr3,arr4);

    }
    public  static void arrInt(int arr1[],int arr2[]){
        int n = arr2.length;
        int m = arr1.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    arr2[j]= MIN_VALUE;
                    break;
                }
            }

        }
    }
      public  static void arrayintersection(int arr1[], int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0,j=0;
        for (; i < arr1.length&&j<arr2.length; ) {
            if(arr1[i]<arr2[j]){
                i++;

            }
            else if (arr1[i]>arr2[j]){
                j++;
            }
            else {System.out.println(arr1[i]);
            i++; j++;}

        }
    }



}
