package recurssion;

public class LastIndexFirstApp {
    public static int getLastIndex(int arr[],int size,int startIndex,int x){
        if (size==0){
            return -1;

        }
        int recIndex=getLastIndex(arr,size-1,startIndex+1,x);
        if (recIndex!=-1){
            return recIndex;
        }
        if (arr[startIndex]==x){
            recIndex= startIndex;
            return recIndex;

        }
        else {

            return -1;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,2,5,2,6,2,7,2,8,9,0};
        System.out.println(getLastIndex(arr,arr.length,0,2));
    }
}
