package mesclinious;
import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        System.out.println(removeChar(str,0,str.length()-1,ch));

    }
    public static String removeChar(String str, int si ,int ei,char ch){
        if (si>=ei){
            return "";
        }
        String ans = "";
        if(str.charAt(si)!=ch){
            ans+=str.charAt(si);

        }
        return ans+removeChar(str,si+1,ei,ch);
    }
}
