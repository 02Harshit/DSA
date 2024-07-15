import java.util.Scanner;
public class InvertedLowerTriangleNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int n=scan.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++)
                System.out.print(j+1);
            System.out.println();
        }
        scan.close();
    }
}
