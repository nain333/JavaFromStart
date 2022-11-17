package mesclinious;

public class ReverseNumber {
    public static int revernumRec(int n, int rev){
        int ld = n%10;
        if (n<10){

            return ld;

        }
        rev=rev*10+ld;


        return revernumRec(n/10,rev);
    }
    public static int revNum(int n){
        int revnum=0;
        for (int i = n; i >0 ; i/=10) {
            int ld= i%10;
            revnum=(revnum*10)+ld;



        }
        System.out.println(revnum);
        return revnum;
    }

    public static void main(String[] args) {
        int num= 1234;
        int rev= revernumRec(num,0);
        System.out.println(num);
        System.out.println();
        int re=revNum(1234);
        System.out.println(re);
    }
}
