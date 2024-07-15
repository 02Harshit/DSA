import java.util.Scanner;
public class IncreasingNumTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print(++k+" ");
            System.out.println();
        }
        scan.close();
    }
}
