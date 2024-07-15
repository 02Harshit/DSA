package Recursion;
import java.util.Scanner;
public class OnetoN {
    static void print(int i,int n){
        if(i>n) return;
        System.out.print(i+" ");
        print(i+1,n);
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        print(1,n);
        scan.close();
    }
}

// Time complexity : O(n) because the function is being called n times
// Space complexity : O(n) because the program is using stack space internally and the functions are gonna be stored n times in the stack. 
