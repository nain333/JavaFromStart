package mesclinious;

public class InsertionSort {
    public static void insertionSort(int  arr[]){
        for (int i = 1; i <arr.length ; i++) {
            int j = i-1;
            int key=arr[i];
            while ( j >=0&&arr[j]>key  ) {

                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=key;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args) {

        int arr[]={9,8,7,6,2,1,3,4,5,4,3,2,1,0};
        insertionSort(arr);

    }
}
