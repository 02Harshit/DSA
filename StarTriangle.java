import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=(2*i)-1;j++)
                System.out.print("*");
            System.out.println();     
        }       
        scan.close();        
    }
}
