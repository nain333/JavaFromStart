package mesclinious;

import java.util.ArrayList;
import java.util.Arrays;

public class SortZeroesToEndInRelativeOrder {
    public static void sort0toEnd(ArrayList<Integer> list){
        int nz=0;
        for (int i=0; i< list.size();i++){
            if (list.get(i)!=0){
                int temp=list.get(i);
                list.set(i,list.get(nz));
                list.set(nz,temp);
                nz++;

            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(2,0,0,1,3,0,0));
        System.out.println(list);
        sort0toEnd(list);
        System.out.println(list);
    }
}
