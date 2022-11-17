package RecurssionOnStringsAss;
import java.util.Scanner;
public class SubsetsOfAnArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = inputArray(n);
        int [][] subset=return_subset(arr);
        printsubsets(subset);
    }
    public static int [][] return_subset(int[] arr){
        int [][] subsets=return_subset(arr,0);
        return subsets;
    }
    public static int[][] return_subset(int [] arr ,int si){
        if (si==arr.length){
            int[][] ret = new int[1][0];

            return ret;
        }
        int [][] sout=return_subset(arr,si+1);
        int [][] out= new int[2*sout.length][];
//guided towards it:
        int k = 0;
        for (int i = 0; i < sout.length; i++) {
            out[k]= new int[sout[i].length];
            for (int j = 0; j < sout[i].length; j++) {
                out[k][j]=sout[i][j];

            }
            k++;
        }
        for (int i = 0; i < sout.length; i++) {
            out[k]= new int[sout[i].length+1];
            out[k][0]=arr[si];
            for (int j = 1; j <= sout[i].length; j++) {
                out[k][j]=sout[i][j-1];

            }
            k++;
        }
        return out;
    }
    public static void printsubsets(int[][] subset){
        for (int i = 0; i < subset.length; i++) {
            for (int j = 0; j < subset[i].length; j++) {
                System.out.print(subset[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static int[] inputArray(int n ){
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elent at possiton: "+ i);
            arr[i]=scn.nextInt();

        }
        return arr;
    }

    public static class PrintSubsetOfAnArray {
        public static void main(String[] args) {
            System.out.println("Enter the size of Array: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = takeInput(n);
            printSubset(arr);
        }
        public static int[] takeInput(int n){
            Scanner scn = new Scanner(System.in);
            int arr[]= new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the Element at possition: "+ i);
                arr[i]= scn.nextInt();

            }
            return arr;
        }
        public static void printArray(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public static void printSubset(int input[]){
            int out[]=new int[0];
            printSubset(input,out,0);
        }
        public static void printSubset(int arr[],int out[], int si){
            if (si==arr.length){
                printArray(out);
                return;


            }
    //      don't  add the current element:
            printSubset(arr,out,si+1);

    //        add the current element:
            int[] aout=new int[out.length+1];
            aout[aout.length-1]=arr[si];
            for (int i = 0; i <out.length ; i++) {
                aout[i]=out[i];
            }
            printSubset(arr,aout,si+1);

            }



        }
}

