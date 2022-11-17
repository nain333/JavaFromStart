package mesclinious;

public class RecursiveSelectionSort {
    public static void recSSort(int arr[],int si, int ei){
        if (si>=ei){
            System.out.println("end reached");
            return;
        }
        int max= arr[si];
        int mindex=si;
        for (int i = si; i <=ei ; i++) {
            if (arr[i]<max){
                mindex=i;

            }




        }
        int temp=arr[mindex];
        arr[mindex]=arr[si];
        arr[si]=temp;

//        recSSort(arr,si,ei);
        recSSort(arr,si+1,ei);
    }
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        recSSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

        }
    }
}
