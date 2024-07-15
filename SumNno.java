package Recursion;
import java.util.Scanner;
public class SumNno {
    static int sum(int i,int n){ 
        if(i>n){
            return 0;
        } 
        int total=i+sum(i+1,n);
        return total;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(sum(1,n));
        scan.close();
    }
    
}
