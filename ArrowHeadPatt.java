                                        //Also known as rotated traingle pattern!
import java.util.Scanner;
public class ArrowHeadPatt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=i;j>0;j--)
                System.out.print("*");
            System.out.println();
        }
        scan.close();
    }
}
