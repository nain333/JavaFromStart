package mesclinious;
import java.util.Scanner;
public class PrintAllSubstrings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printAllSubsItratively(str);
    }
    public static void printAllSubstring(String str ){
        printAllSubstring(str,0,str.length()-1);
    }
    public static void printAllSubstring(String str,  int si,int ei){
        if (si>=ei){
            return;
        }
//
        for (int i = si; i <=ei ; i++) {
            System.out.println(str.substring(si,i));

        }
        printAllSubstring(str,si+1,ei);

    }
    public static void printAllSubsItratively(String str){
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <=str.length() ; j++) {
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();

        }
    }

}
