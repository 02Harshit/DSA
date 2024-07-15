import java.util.Scanner;
public class Rhombus{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of lines of half rhombus : ");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i+1;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            for(int j=0;j<2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
        scan.close();
    }
}