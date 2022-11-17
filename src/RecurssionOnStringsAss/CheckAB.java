package RecurssionOnStringsAss;
import java.util.Scanner;
public class CheckAB {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input=sc.next();
        System.out.println(checkAB(input));
    }
    public static boolean checkAB(String input){
//        if (input.length()==0){
//            return true;
//        }
//        boolean isAB=true;
//        if (input.charAt(0)!='a'){
//            return false;
//        }
//        if (input.substring(1,3)!="bb"){
//            return false;
//        }
//        if (input.substring(0,1)=="bb"){
//            if (input.charAt(2)!='a'){
//                return false;
//            }
//        }
//        return checkAB(input.substring(1));
//
//
//
//    }
        if (input.length()==0){
            return true;
        }
        if (input.charAt(0)=='a'){
            if (input.substring(1).length()>1&&input.substring(1,3).equals("bb")){
                return checkAB(input.substring(3));
            }
            else {
                return checkAB(input.substring(1));
            }

            }
        return  false;
        }

}
class CheckAb{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        System.out.println(checkAb(input));

    }
    public static boolean checkAb(String input){
        if (input.length()==0){
            return true;
        }
        if (input.charAt(0)=='a'){
            if (input.substring(1).length()>1&&input.substring(1,3).equals("bb")){
                return checkAb(input.substring(3));

            }
            else return checkAb(input.substring(1));
        }
        return false;
    }
}
