package mesclinious;

public class Sort0and1 {
    public static void sort0and1(int arr[]){
        for (int i = 0,j=arr.length-1; i <= j; ) {
            if (arr[i]==0){
                i++;
            } else if (arr[j]==1) {
                j--;
            }
            else {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

        }

    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,0,1};
        sort0and1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }


    }
}
