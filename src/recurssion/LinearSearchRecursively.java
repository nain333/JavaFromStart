package recurssion;

public class LinearSearchRecursively {
    public static int linearSearch(int arr[], int x, int startIndex){
        if (startIndex>=arr.length){
            return -1;
        }
        if (arr[startIndex]==x){
            return startIndex;
        }
        return linearSearch(arr,x,startIndex+1);

    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int index = linearSearch(arr,4,0);
        System.out.println(index );

    }
}
