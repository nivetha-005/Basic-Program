import java.util.*;
import java.util.Scanner;
class Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            ch=(char)(ch + 32);
        }
        else if(ch>='a' && ch<='z'){
            ch=(char)(ch - 32);
        }
        System.out.println(ch);
    }
}