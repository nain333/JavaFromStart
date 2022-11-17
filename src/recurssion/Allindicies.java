package recurssion;

public class Allindicies {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static int[] getAllIndicies(int arr[], int x, int startIndex){
        if (startIndex==arr.length){
            int [] output= new int[0];
            return output;
        }
        int[] smallOutput=getAllIndicies(arr,x,startIndex+1);
        if (arr[startIndex]==x){
            int[] output= new int [smallOutput.length+1];
            output[0]=startIndex;
            for (int i = 0; i < smallOutput.length; i++) {
                output[i+1]=smallOutput[i];

            }
            return output;
        }
        else {
            return smallOutput;
        }




    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,5,3,2,1,2,3,2,0};
        printArray(getAllIndicies(arr,2,0));

    }
}
