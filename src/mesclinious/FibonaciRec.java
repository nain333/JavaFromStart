package mesclinious;
import java.util.*;
public class FibonaciRec {
    public static int fib(int x) {
        if (x<=1){
            return x;


        }
        return fib(x-1)+fib(x-2);
//        if (x <= 1)
//            return x;
//        return fib(x - 1) + fib(x - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib =fib(n);
        System.out.println(fib);
    }
}
