package Recurssion_1_assignment;

public class Check_Palindrome {
    public static boolean checkPalindrome(String st){
        if (st.length()<=1){
            return true;

        }
        if (st.charAt(0)==st.charAt(st.length()-1)){

            return checkPalindrome(st.substring(1,st.length()-1));
        }
        else {
            return false;
        }


    }
    public static void main(String[] args) {
        String st  = "him";
        System.out.println(checkPalindrome(st));

    }
}
