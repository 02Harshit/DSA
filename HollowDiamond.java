import java.util.Scanner;
public class HollowDiamond {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n)-i;j++)
                System.out.print("*");
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
                flag=j;
            }
            for(int j=0;j<(n)-i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            for(int j=flag;j>=0+2*i;j--){
                System.out.print(" ");
                
            }
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        scan.close();
        
    }
}
