package RecurssionOnStringsAss;
import java.util.Scanner;
public class Staircase {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int cases=starCase(n);
        System.out.println(cases);
    }
    public static int starCase(int n){
       if (n<=1){
           return 1;
       }

//        first case:

        int x =starCase(n-1);
        int y = starCase(n-2);
        int z = starCase(n-3);
        return x+y+z;


    }
}
