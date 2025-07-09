import java.util.*;
import java.util.Scanner;
public class Triangle{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value:");
    int row=sc.nextInt();
    int n=1;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
           System.out.print(n + " ");
           n++;
        }
        System.out.println();
    }
    }
}