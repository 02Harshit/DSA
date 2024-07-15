import java.util.Scanner;
public class GCD_HCF1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1=scan.nextInt();
        System.out.print("Enter second number : ");
        int n2=scan.nextInt();
        // BRUTE FORCE (UNOPTIMIZD APPROACH)
        int gcd=1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0) gcd=i;
        }
        System.out.println("GCD is "+gcd);
        //TIME COMPLEXITY IS O(MIN(n1,n2))
        scan.close();
    }
}
