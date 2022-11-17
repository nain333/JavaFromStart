package recurssion;

public class SumOfArrayOptimally {
    public static int getArraySumOptimally(int arr[]){
        return getArraySumOptimally(arr,0);
    }
    public static int getArraySumOptimally(int arr[],int startIndex){
        if (startIndex==arr.length){
            return 0;

        }
        return arr[startIndex]+getArraySumOptimally(arr,startIndex+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(getArraySumOptimally(arr ));


    }
}
