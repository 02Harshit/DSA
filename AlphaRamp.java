import java.util.Scanner;
public class AlphaRamp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print((ch)+" ");
            ch++;
            System.out.println();
        }
        scan.close();
    }
    
}
