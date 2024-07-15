import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int orig_num=n;
        String number =String.valueOf(n);
        int size=number.length(); 
        int cube=0;
        while(n>0){
            int ld=n%10;
            cube+=(int)(Math.pow(ld,size));
            n=n/10;
        }
        if(orig_num==cube) System.out.println("true");
        else System.out.println("false");
        sc.close();
    }
}
