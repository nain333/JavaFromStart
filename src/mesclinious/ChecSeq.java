package mesclinious;

public class ChecSeq {
    public static boolean seqValidity(int arr[]){
        boolean sd=true;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                return false;

            }

        }
        return true;
    }
    public static void main(String[] args) {
        int arr2[]={2,5,7,10};
        int arr[]={10,4,3,8,15,4};
        System.out.println(seqValidity(arr2));
        System.out.println(seqValidity(arr));


    }
}
