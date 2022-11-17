package mesclinious;
import java.util.*;
import java.math.*;
public class TotalSalary {
    public static int calculateTotal(int sal, char grade){
        double hra= 0.2*sal;
        double da =.5*sal;
        double pf=.11*sal;
        int allow;
        if (grade=='A'){
            allow = 1700;


        } else if (grade=='B') {
            allow=1500;


        }
        else {
            allow=1300;

        }

        double total_sal=hra+da+allow+sal-pf;
        System.out.println(total_sal);

        return (int) Math.round(total_sal);

    }
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("please input the salary:");
        int sal = sc.nextInt();
        System.out.println("Please enter the grade:");
        char grade = Character.toUpperCase(sc.next().charAt(0));
        int totalSal=calculateTotal(sal,grade);
        System.out.println(totalSal);

    }



}
