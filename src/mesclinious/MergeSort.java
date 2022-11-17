package mesclinious;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={3,2,1,0,9,8,7,6,5,4,};
        mergeSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//
//        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        if (si>=ei){
            return ;
        }
        int mid=(si+ei)/2;
        mergeSort(arr,si, mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei);


    }
    public static void mergeSort(int arr[]){
        mergeSort(arr, 0,arr.length-1);

    }
    public static void merge(int arr[],int  si,int ei){
        int mid = (si+ei)/2;
        int sarr[]=new int[arr.length];
        int i=si,j=mid+1,k=0;
        while(i<=mid&&j<=ei){
            if (arr[i]<arr[j]){
                sarr[k++]=arr[i++];
            }
            else {
                sarr[k++]=arr[j++];
            }
        }
        while (i<=mid){
            sarr[k++]=arr[i++];
        }
        while(j<=ei){
            sarr[k++]=arr[j++];
        }
//        int fi=0;
//        for (int l = si; l <= ei; l++) {
//            arr[fi++]=sarr[l];
        for (int l = 0; l <sarr.length ; l++) {
            System.out.print(sarr[l]+" ");
        }
        System.out.println();
        }

    }



