package Recursion;
import java.util.Scanner;
public class Fibonacci {
    static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the fibonacci term number : ");
        int n=sc.nextInt();
        System.out.println(fibonacci(n-1));
        sc.close();
    }
}
/*TIME COMPELXITY - O(2^n) because for each finbonacci function, we are calling 2 sub functions 
and they may be further calling 2 sub functions and hence the time complexity is exponential */
