import java.util.Scanner;
public class NumberCrown {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print(j+1);
            for(int j=0;j<(n+2)-2*i;j++)
                System.out.print(" ");
            for(int j=i;j>=0;j--)
                System.out.print(j+1);
            System.out.println();    
        }
        scan.close();
    }
}
