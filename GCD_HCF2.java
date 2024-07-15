import java.util.Scanner;
public class GCD_HCF2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1=scan.nextInt();
        System.out.print("Enter the second number : ");
        int n2=scan.nextInt();
        //By EUCLID'S ALGORITHM (OPTIMIZED ALGO) GCD(a,b) => GCD(a%b,b) where a>b
        while(n1>0 && n2>0){
            if(n1>n2) n1=n1%n2;
            else n2=n2%n1;
            if(n1==0) System.out.println(n2);
            else System.out.println(n1);
        }
        scan.close();
    }
}
