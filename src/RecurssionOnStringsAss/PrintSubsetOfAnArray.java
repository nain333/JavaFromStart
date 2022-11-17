package RecurssionOnStringsAss;
import java.util.Scanner;
public class PrintSubsetOfAnArray {
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



