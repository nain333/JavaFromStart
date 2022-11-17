package mesclinious;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindPairSum {
    public static int findPairSum ( ArrayList<Integer> arr, int x){
        int pair=0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j =i+1; j<arr.size(); j++){
                if(arr.get(i)+arr.get(j)==x){
                    pair++;
                }
            }


        }
        return pair;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(1, 3, 6, 2, 5, 4, 3 ,2 ,4));
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int pairs=findPairSum(arr1,x);
        System.out.println(pairs);

    }
}
