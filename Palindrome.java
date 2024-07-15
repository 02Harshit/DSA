package Recursion;
import java.util.Scanner;
public class Palindrome {
    static boolean isPalindrome(String str,int i,int n){
        if(i>=n/2) return true;
        if(str.charAt(i)==str.charAt(n-i-1)) 
           return isPalindrome(str,i+1,n);
        else return false;
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=scan.next();
        int n=str.length();
        if(isPalindrome(str,0,n)) System.out.println("Given string is a palindrome!");
        else System.out.println("Given string is not a palindrome!");
        scan.close();
    }
}
