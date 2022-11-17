package Recursion2;

public class RemoX {
    public static String removeX(String str, char x){
        if (str.length()==0){
            return str;
        }
        String smallAns="";
        if (str.charAt(0)!=x){
            smallAns=str.charAt(0)+smallAns;

        }
        String Ans = removeX(str.substring(1),x);
        return  smallAns+Ans;
    }
    public static void main(String[] args) {
        String str = "abba";
        char ch ='a';
        String ans = removeX(str,ch);
        System.out.println(ans);

    }
}
