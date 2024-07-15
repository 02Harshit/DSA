import java.util.Scanner;
public class AlphaHill {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=0;j<n-1-i;j++)
                System.out.print(" ");
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<breakpoint) ch++;
                else ch--;
            }
            for(int j=0;j<n-1-i;j++)
                System.out.print(" ");
            System.out.println();
        }
        scan.close();
    }
}
