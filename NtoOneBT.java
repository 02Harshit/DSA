package Recursion;
import java.util.Scanner;
public class NtoOneBT {
    static void print(int i,int n){
        if(i>n) return;
        print(i+1,n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);    
        int n=scan.nextInt();
        print(1,n);
        scan.close();
    }
}
