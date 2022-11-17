package mesclinious;

public class SelectionSort {
    public static void selectionSort(int arr[]){

        for (int i = 0; i <arr.length ; i++) {
            int max = arr[i];
            int mindex=i;
            int j  =i;
            for ( ;j < arr.length; j++) {
                if (arr[j]>max) {
                    max = arr[j];
                    mindex=j;
                }


            }
            int temp=arr[mindex];
            arr[mindex]=arr[i];
            arr[i]=temp;




        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4};
        selectionSort(arr);
    }
}
