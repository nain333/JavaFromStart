package recurssion;

public class SumOfArray {
    public static int sumOfArray(int arr[]){

        if (arr.length<1){
            return 0;

        }
        int[] sarr=new int[arr.length-1];
        for (int i = 1; i<arr.length ; i++){
            sarr[i-1]=arr[i];
        }
        return arr[0]+ sumOfArray(sarr);


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int sum= sumOfArray(arr);
        System.out.println(sum);
    }
}
