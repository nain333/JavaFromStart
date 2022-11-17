package mesclinious;

public class BinarySearch {
    public static int bs (int[] arr,int x ,int si, int ei){
        if (si>ei) {

            return -1;
        }
        int mid = (si+ei)/2;
        if (arr[mid]==x){
            return mid;
        } else if (arr[mid]<x) {
            si=mid+1;


        }
        else {
            si=mid-1;
        }
        return bs (arr,x,si,ei);


    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int ind=bs(arr,6,0,arr.length-1);
        System.out.println(ind);
    }

}
