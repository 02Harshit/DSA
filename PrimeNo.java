import java.util.Scanner;
public class PrimeNo {
    public static void isPrime(int n){
        int flag=-1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag++;
                System.out.println(n+" is not a prime number.");
                break;
            }
        }
        if(flag==-1) System.out.println(n+" is a prime number.");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=scan.nextInt();
        if(n==0 || n==1) System.out.println(n+" is not a prime number");
        else isPrime(n); 
        scan.close();
    }
}
