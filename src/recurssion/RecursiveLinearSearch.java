package recurssion;
import java.util.*;

public class RecursiveLinearSearch {
    public static int recursiveLinearSearch(int arr[], int x ,int l, int r){
        if (r<1){
            return -1;
        }
        if (arr[r]==x){
            return r;
        }
        if (arr[l]==x){
            return l;

        }
        return  recursiveLinearSearch(arr, x,l+1,r-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find or Search: ");
        int x = sc.nextInt();
        int ind =recursiveLinearSearch(arr,x,0,arr.length-1);
        System.out.println("The number "+x+" is present at : "+ (ind+1)+" possition.");


        
    }

}
