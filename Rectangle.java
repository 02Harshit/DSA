import java.util.Scanner;
class Rectangle{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of rows and column: ");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print("*");
            System.out.println();
        }
        scan.close();
    }
}