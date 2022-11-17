package Recursion2;

public class QuickSort {

    public static void main(String[] args) {
        int arr[]={2,1,2,1,2,1,2,1};
        quickSort(arr,0,arr.length-1);
        printArray(arr);

    }
    public static void quickSort(int [] arr, int si,int ei){
        if (si>=ei){
            return;
        }
        int pp=partition(arr, si,ei);
        quickSort(arr,si,pp-1);
        quickSort(arr,pp+1,ei);
    }
    public static int partition(int[]arr,int si,int ei){
        int piv=arr[si];
        int count=0;
        for (int i = si+1; i <=ei ; i++) {
            if (arr[i]<=piv){
                count++;
            }

        }
        int pp=si+count ;
        int temp=arr[pp];
        arr[pp]=arr[si];
        arr[si]=temp;
        int i = si, j=ei;
        while(i<pp&&j>pp){
            if (arr[i]<=piv){
                i++;
            } else if (arr[j]>piv) {
                j--;

            }
            else {
                int ntemp=arr[i];
                arr[i]=arr[j];
                arr[j]=ntemp;
                i++;
                j--;
            }
        }
        return pp;
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
