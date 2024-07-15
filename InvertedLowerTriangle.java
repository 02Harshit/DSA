import java.util.Scanner;
public class InvertedLowerTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n=scan.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--)
                System.out.print("*");
            System.out.println();
        }
        scan.close();
    }
}
