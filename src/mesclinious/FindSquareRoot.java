package mesclinious;
import java.util.*;
public class FindSquareRoot {
    public static int findsqrtrec(int n,int si){
        if (si * si == n) {


            return si;

        }
        if (si*si>n){
            return si-1;
        }
        return findsqrtrec(n, si+1);
    }
    public static int findSqrt(int n){
        int sqrt=0;
        for (int i = 0; i*i <=n ; i++) {
            sqrt=i;

        }
        return sqrt;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt=findSqrt(n);
        System.out.println(sqrt);
        int ans = findsqrtrec(n,0);
        System.out.println(ans);
    }


}
