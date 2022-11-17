package mesclinious;
import java.util.ArrayList;

public class ArrayIntersection {
    public static ArrayList<Integer> intersection(int arr[],int arr2[]){
        ArrayList<Integer> intersection=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i]==arr2[j]){
                        intersection.add(arr[i]);
                        arr2[j]=Integer.MIN_VALUE;


                }

            }

        }
        return  intersection;
    }

    public static void main(String[] args) {
        int arr[]= {2,6,8,5,4,3};
        int arr2[]={2,3,4,7};
        int[] arr3={10,10};
        int arr4[]={10};
        int[] arr5={2,6,1,2,2};
        int[] arr6={1,2,3,4,2};
//        ArrayList<Integer> list1= new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(0,0);
//        int fourth=list1.get(4);
//
//        System.out.println(list1);
//        System.out.println(fourth);
//        list1.set(4,Integer.MAX_VALUE);
//        System.out.println(list1);
//        list1.remove(list1.toArray().length-1);
//        System.out.println(list1);
        System.out.println(intersection(arr,arr2));
        System.out.println(intersection(arr2,arr4));
        ArrayList<Integer> inter=(intersection(arr5,arr6));
        System.out.println(inter.size());

    }


}
