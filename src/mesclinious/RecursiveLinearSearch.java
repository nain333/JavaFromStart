package mesclinious;

public class RecursiveLinearSearch {
    public static int recLs(int arr[],int si, int ei,int x){
        if (si>ei){
            return -1;
        }
        if (arr[si]==x){
            return si;
        }
        return recLs(arr,si+1,ei,x);
    }
    public static void main(String[] args) {
        int arrp[]={1,2,3,4,5,6};
        int xi=recLs(arrp,0, arrp.length-1,5);
        System.out.println(xi);
        int xi2=recLs(arrp,0, arrp.length,1);
        System.out.println(xi2);
    }
}
