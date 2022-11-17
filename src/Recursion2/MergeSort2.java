package Recursion2;

public class MergeSort2 {
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        mergeSort(arr,0, arr.length-1);
        printArray(arr);
    }
    public static void mergeSort(int arr[],int si,int ei){
        if (si>=ei){
            return;

        }
        int mid = (si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei); }
    public static void merge(int arr[],int si , int ei){
        int[] out=new int[ei-si+1];
        int mid = (si+ei)/2;
        int i = si, j =mid+1, k=0;
        while(i<=mid&&j<=ei ){
            if (arr[i]<arr[j]){
                out[k++]=arr[i++];
            }
            else {
                out[k++]=arr[j++];
            }
        }
        while(i<=mid){
            out[k++]=arr[i++];
        }
        while(j<=ei){
            out[k++]=arr[j++];
        }
        int m =0;
        for (int x = si; x <= ei; i++) {
            arr[x]=out[m++];
        }
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

