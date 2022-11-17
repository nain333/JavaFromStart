package recurssion;
import java.util.*;
public class LastIndexofaNumber {

    public static int lastIndexofanumberItratively(int arr[] , int x){
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                index=i;
            }

        }
        return index;
    }
    public static int lastIndexRecursively(int arr[],int startIndex,int x){
        if (startIndex==0){
            return -1;
        }
        if (arr[startIndex]==x){
            return startIndex;

        }

        return lastIndexRecursively(arr,startIndex-1,x);

    }
    public static int lastIndexRecursivelyInitbreak(int arr[],int startIndex,int size,int x){
        if (size==0){
            return-1;
        }
        int sas=lastIndexRecursivelyInitbreak(arr,startIndex+1,size-1,x);
        if (arr[0]==x){

            return 0;
        }
        else {
            return -1;
        }
    }
    public static int firstIndexofanumberrecursively(int arr[],int startIndex,int x){
        if (startIndex==arr.length){
            return -1;
        }
        if (arr[startIndex]==x){
            return startIndex;

        }
        int ans=firstIndexofanumberrecursively(arr,startIndex+1,x);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,3};
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
       int x = sc.nextInt();
        System.out.println(firstIndexofanumberrecursively(arr,0,x));
        System.out.println(lastIndexRecursively(arr,arr.length-1,x));
        System.out.println(lastIndexRecursivelyInitbreak(arr,0,arr.length-1,x));

    }
}
