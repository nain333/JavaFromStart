package mesclinious;
import javax.management.StringValueExp;
import java.util.Scanner;
public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compress(str));
        System.out.println(getComp(str));
        System.out.println(compressmine(str));
    }

    public static String compress(String str) {
        if (str.length() == 1) {
            return str;
        }
        String compressed = "";
        int count = 1;
//        Transverse over  the whole String
//        if consicutive element count
        compressed+=str.charAt(0);
        for (int i = 1; i < str.length() ; i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;

            } else {
                if (count > 1) {
                    compressed += count;
                    count = 1;

                }
                compressed += str.charAt(i);

            }
        }

    if (count>1){
        compressed+=count;


    }
        return compressed;
    }
    public static String getComp(String str){
        int n = str.length()-1;
        String answer="";
        if (n<=1){
            return answer;
        }
        int  currentCharCount=1;
        answer+=str.charAt(0);
        for (int i =1; i<=n; ++i){
            if (str.charAt(i)==str.charAt(i-1)){
                ++currentCharCount;
            }
            else{
                if (currentCharCount>1){
                    answer+=currentCharCount;
                    currentCharCount=1;
                }
                answer+=str.charAt(i);
            }
        }
        if (currentCharCount>1){
            answer+=currentCharCount;
        }
//        answer+=str.charAt(n);

        return answer;
    }
    public static String compressmine(String str){
        int n = str.length()-1;
        if (n<=1){
            return str;
        }
        int count = 1;
        String compressed="";
        compressed+=str.charAt(0);
        for (int i = 1; i <n+1 ; i++) {
            if (str.charAt(i-1)==str.charAt(i)){
                count ++;
            }
            else {
                if (count > 1) {
                    compressed += count;
                    count=1;
                }
                compressed += str.charAt(i);

            }

        }
        if (count>1){
            compressed+=count;
        }

        return compressed;
    }

















}
