public class RecursiveBs {
    public static void RecursiveBubbleSort(int arr[], int si, int ei){
        if (si>=ei){
            return;
        }
        for (int i = si; i < ei; i++) {
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
        RecursiveBubbleSort(arr, si,ei-1);
    }

    public static void main(String[] args) {
        int arr[]={0,9,8,7,6,5,4,3,2,1};
        RecursiveBubbleSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
