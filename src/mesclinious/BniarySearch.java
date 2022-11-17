package mesclinious;

public class BniarySearch {
    public static int binarySearch(int arr[],int x ,int si, int ei ){
        if (si>ei){
            return -1;
        }
        int mid= (si+ei)/2;
        if (arr[mid]==x){
            return mid;
        }
        else if (arr[mid]<x){
            ei=mid-1;
        }
        else {
            si=mid+1;
        }

        return binarySearch(arr,x,si,ei);
    }
    public static void main(String[] args) {
        int arr[]={8,7,5,4,3,2,1};
        int x = 5;
       int ind= binarySearch(arr,x,0,arr.length-1);
        System.out.println(ind);
    }
}
