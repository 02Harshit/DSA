import java.util.Scanner;
public class IncreasingLetterTrianlge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++)
                System.out.print(ch+" ");
            System.out.println();
        }
        scan.close();
    }
}
