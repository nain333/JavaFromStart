package mesclinious;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for ( j = 0; j < arr.length-i-1; j++) {
                if (arr[j]<=arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("The Sorted Array is: "+"\n { "+arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        int arr[]={9,5,1,4,2,3,1,0,5};
        bubbleSort(arr);
    }
}
