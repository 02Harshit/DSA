import java.util.Scanner;
public class ReverseDigits{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sign = n<0 ? -1 : 1;
        n=Math.abs(n);
        int rev_num=0;
        while(n>0){
            int ld = n % 10;
            if(n>(Integer.MAX_VALUE - ld) / 10){
                System.out.println(0);
                System.exit(0);
            } 
            rev_num=(rev_num*10)+ld;
            n=n/10;
        }
        System.out.println(sign*rev_num);
        scan.close();
    }
}