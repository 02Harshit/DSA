import java.util.Scanner;
public class ReverseStarTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int n=scan.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            for(int j=0;j<(2*i)-1;j++)
                System.out.print("*");
            System.out.println();
        }
        scan.close();
    }
}
