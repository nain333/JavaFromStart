package mesclinious;
import java.util.Scanner;
public class FindHeighestFrequency {
    public static void main(String[] args) {
//        Enter the string
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char max=findhighest(str);
        System.out.println(max);

    }
    public static char findhighest(String str){
        if (str.length()==1){
            return str.charAt(0);
        }
        int arr[] = new int[256];
        for (int i = 0; i<str.length(); i++){
            arr[str.charAt(i)]+=1;
        }
        int max = Integer.MIN_VALUE;
        int mxdex=-1;

        for (int i =0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
                mxdex=i;
            }


        }

        return (char)(mxdex);
    }
}
