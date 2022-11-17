package Recursion2;

public class MergeSort {
    public static void merge(int[] arr, int si, int ei){
        int size=ei-si+1;


        int[] out = new int[size];
        int mid= (si+ei)/2;
        int i=si, j=mid+1, k=0;

        while (i<=mid&&j<=ei){
            if (arr[i]<arr[j]){
                out[k++]=arr[i++];
            }
            else {
                out[k++]=arr[j++];
            }



            }
        while (i<=mid){           out[k++]=arr[i++];
        }
        while(j<=ei){
            out[k++]=arr[j++];
        }
        int m =0;
        for (int l = si; l <= ei; l++) {
            arr[l]=out[m++];


        }


        }


    public static void mergeSort(int arr[],int si, int ei){
        if (si>=ei){

            return;
        }


        int mid = (si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei);


    }
    public static void printArray(int arr[]){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,100,8,6,5,2,6};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
