package mesclinious;

public class ReverseString {
    public static String revString(String str){
        String revStr="";
        int j =str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            revStr+=str.charAt(j);
            j--;

        }
        return revStr;
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(revString(str));
        String rev=(revStrRec("abcd"));
        System.out.println(rev);
    }
    public static String revStringRec(String str,int si, int ei  ){
//        base case on ei:
        if (ei<si){
            return " ";
        }
        String revStr=""+str.charAt(ei);
        return revStr+revStringRec(str,si,ei-1);



    }
    public static String revStrRec(String str){
        return revStringRec(str,0,str.length()-1);
    }
}

