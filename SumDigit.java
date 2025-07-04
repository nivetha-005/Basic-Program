import java.util.*;
import java.util.Scanner;
public class SumDigit
{
public static void main(String[] args)
{
int count=0;
int r=0,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int n=sc.nextInt();
while(n>0){
r=n%10;
n=n/10;
sum=sum+r;
count++;
}
System.out.println(sum);

}
}
