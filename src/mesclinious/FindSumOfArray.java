package mesclinious;

public class FindSumOfArray {
    public static int sumofarr(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        return sum;
    }
    public static int findSumRec(int arr[] ,int si,int ei ){
        if (si>ei){
            return 0;
        }
        return findSumRec(arr,si+1,ei)+arr[si];
    }
    public static int findSumRec(int arr[]){
        int si = 0,ei=arr.length-1;
        int sum= findSumRec(arr,si,ei);
        return  sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int sumRec=findSumRec(arr);
        System.out.println("Recursive sum is:"+sumRec);
        int interativeSum=sumofarr(arr);
        System.out.println("The itrative sum is: "+ interativeSum);

    }
}
