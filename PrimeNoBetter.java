import java.util.Scanner;
public class PrimeNoBetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(n/i!=i) count++;
            }
        }
        if(count==2) System.out.println(n+" is a prime number.");
        else System.out.println(n+" is not a prime number.");
        scan.close();
    }
}
