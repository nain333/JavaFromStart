package RecurssionOnStringsAss;
import java.util.Scanner;
public class PrintSubsetsSumToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the size of the Array: ");
        int n = sc.nextInt();
        int input[] = takeInput(n);
        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();
        printSubsetsSumToK(input,k);
    }
    public static int[] takeInput(int n){
        Scanner scn = new Scanner(System.in);
        int input[ ]= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+ (i+1) +"th element");
            input[i]=scn.nextInt();


        }
        return input;
    }
    public static void printArray (int output[]){
        System.out.print("{");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+ " ");
        }
        System.out.println("}");
        System.out.println();
    }
    public static void printSubsetsSumToK(int input[],int k){
        int [] out = new int[0];
        printSubsetsSumToK(input,out,k,0);
    }
    public static void printSubsetsSumToK(int input[],int output[], int k, int si){
        if (si==input.length){
            if (k==0){
                printArray(output);
                return;

            }
            else{
                return;
            }
        }
//        don't add input[si];
        printSubsetsSumToK(input,output,k,si+1);
//        add the input[si];
        int[] pout= new int[output.length+1];
        pout[0]=input[si];
        for (int i = 1; i < output.length+1 ; i++) {
            pout[i]=output[i-1];
        }
        printSubsetsSumToK(input,pout,k-input[si],si+1);

    }

}
