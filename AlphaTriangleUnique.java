import java.util.Scanner;
public class AlphaTriangleUnique {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++){
            char ch=(char)('A'+(n-1));
            ch =(char)(ch - i);
            for(int j=0;j<=i;j++){
                System.out.print((ch++)+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}