package mesclinious;
import java.util.Scanner;
public class ReverEachWord {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         System.out.println(reverseEachWord(str+" "));
         rev("this is a sample text");
        
    }
    public static String reverseEachWord (String str){
         String revStr="";
         int currentWordStart=0;
         int currentWordEnd=0;
         int i = 0;
        for (; i < str.length(); i++) {


            if (str.charAt(i)==' '){
                currentWordEnd=i-1;
                for (int j =currentWordStart; j <=currentWordEnd ; j++) {
                    revStr=str.charAt(j)+revStr;

                }
                revStr+=" ";
                currentWordStart=i+1;





            }
//            for the last word.





            
            
        }
        return revStr;
    }
    public static void rev(String str){
        String input= "The dog is chasing";

        String[] arr= input.split(" ");
        String reverse="";
        for(int i=arr.length-1;i>=0;i--)
        {
            reverse+= ((reverse.equals(""))?"":" ")+arr[i];
        }
        System.out.println(reverse);

    }
}
