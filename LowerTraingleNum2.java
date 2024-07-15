import java.util.Scanner;
public class LowerTraingleNum2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print(i+1);
            System.out.println();
        }
        scan.close();
    }
}
