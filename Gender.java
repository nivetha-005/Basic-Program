import java.util.*;
import java.util.Scanner;
class Gender {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Gender:");
        String g=sc.next();
        System.out.println("Enter the Age:");
        int a=sc.nextInt();
        if(g.equals("Female") && (a>=1 && a<=58)){
            System.out.println("The percentage of interest is: 8.2%" );
        }
        else if(g.equals("Female") && (a>=59 && a<=100)){
            System.out.println("The percentage of interest is: 9.2%" );
        }
        else if(g.equals("Male") && (a>=1 && a<=58)){
            System.out.println("The percentage of interest is: 8.4%" );
        }
        else if(g.equals("Male") && (a>=59 && a<=100)){
            System.out.println("The percentage of interest is: 10.5%" );
        }
    }
}