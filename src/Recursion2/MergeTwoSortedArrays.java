package Recursion2;

public class MergeTwoSortedArrays {
    public static void printArray (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    public static  int[] mergeSorted(int arr1[],int arr2[]) {
        int arr3[] = new int[arr1.length + arr2.length];
        int i =0, j =0,  k =0;
        while (i<arr1.length&&j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];

            } else {
                arr3[k++] = arr2[j++];
            }
        }

            while (i<arr1.length){
                arr3[k++]=arr1[i++];
            }
            while (j<arr2.length){
                arr3[k++]=arr2[j++];
            }

        return arr3;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={7,9,10,12,15,16,18};
        int arrnew[]=mergeSorted(arr1,arr2);
        printArray(arrnew);


    }
}
