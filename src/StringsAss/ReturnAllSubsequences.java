package StringsAss;

import java.util.Scanner;
public class ReturnAllSubsequences{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = sc.next();
        String  output[]=returnAllSubsequences(input);
        printString(output);

    }
    public static String[] returnAllSubsequences(String input){
        if(input.length()==0){
            String[] output={""};
            return output;

        }
        char firstChar=input.charAt(0);
        String[] output=returnAllSubsequences(input.substring(1));
        String[] pout=new String[output.length*2];
        int k=0;
        for(String s:output){
            pout[k++]=s;
        }
        for(String s:output){
            pout[k++]=firstChar+s;
        }
        return pout;
    }
    public static void printString(String[] output){
        for(String s:output){
            System.out.println(s);
        }

        }

    }


