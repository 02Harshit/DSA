package Recursion;
import java.util.Scanner;
public class PalindromeLC {
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        String result = s.replaceAll("[^a-z0-9]","");
        if(result.isEmpty()) return true;
        int length=result.length();
        int i=0;
        while(i<=length/2){
            if(result.charAt(i)!=result.charAt(length-i-1)) return false;
            i++;
        }
        return true;
        }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        System.out.println(isPalindrome(s));
        scan.close();
    }
    }
