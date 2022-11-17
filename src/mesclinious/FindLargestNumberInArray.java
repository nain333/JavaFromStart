package mesclinious;

public class FindLargestNumberInArray {
    public static int largestInArray(int arr[],int si, int ei) {
        if (si >= ei) {
            return 0;
        }
        int max = arr[si];
        if (arr[si] < arr[si + 1]) {
            max = arr[si + 1];

        }
        int max2 = largestInArray(arr, si + 1, arr.length - 1);
        if (max < max2) {
            return max2;
        } else {
            return max;
        }
    }

    public static void main(String[] args) {
        int arr[]={10,2,3,4,9,5,6,7};
        int max=largestInArray(arr,0,arr.length-1);
        System.out.println(max);
    }
    }

