package Recursion2;

public class ReplaceChar {
    public static String replaceCharRecursively(String str, char y ,char x){
        if (str.length()==0){
            return str;
        }
        String smallAns="";
        if (str.charAt(0)==y) {
            smallAns=smallAns+x;
        }
        else {
            smallAns=smallAns+str.charAt(0);
        }
        String ans= smallAns+replaceCharRecursively(str.substring(1),y,x);


        return ans;
    }

    public static void main(String[] args) {
        String str="cacacca";
        char y = 'a';
        char x ='x';
        System.out.println(replaceCharRecursively(str,y,x));
    }
}





