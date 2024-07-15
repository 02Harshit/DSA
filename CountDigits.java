import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
        // int count=0;
        // while(n>0){
        //     count++;
        //     n=n/10;
        // }
        // OPTIMIZED APPROACH
        long count=(long)(Math.log10(n)+1);
        System.out.println(count);
        scan.close();
    }
}
