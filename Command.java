import java.util.*;
import java.util.Scanner;
public class Command{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String[] a=new String[3];
    System.out.println("Enter the company name:");
    a[0]=sc.next();
    System.out.println("Enter the place:");
    a[2]=sc.next();
    System.out.println(a[0] + " Technologies " + a[2]);
    }
}