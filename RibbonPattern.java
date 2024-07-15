import java.util.Scanner;
public class RibbonPattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int init_space=2*n-2;
        for(int i=0;i<2*n-1;i++){
            int stars=i;
            if(i>n-1) {
                stars=2*n-2-i;
            }
            for(int j=0;j<=stars;j++)
                System.out.print("*");
            for(int j=0;j<init_space;j++)
                System.out.print(" ");
            for(int j=0;j<=stars;j++)
                System.out.print("*");
            System.out.println();
            if(i<n-1) init_space-=2;
            else init_space+=2;
        }
        scan.close();
    }
    
}
