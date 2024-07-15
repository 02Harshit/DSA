package Recursion;
import java.util.Scanner;
public class NtoOne {
    static void print(int i,int n){
        if(i>n) return;
        System.out.print(n+" ");
        print(i,n-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        print(1,n);
        scan.close();
    }
}
