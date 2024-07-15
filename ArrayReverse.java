package Recursion;
import java.util.Scanner;
public class ArrayReverse {
    static int[] reverse(int a[],int l,int r){
        if(l>=r) return a;
        int c;
        c=a[l]; //Swapping
        a[l]=a[r];
        a[r]=c;
        return reverse(a,l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a[];
        System.out.print("Enter the number of elements in the array :");
        int n=scan.nextInt();
        a=new int[n];
        System.out.println("Enter "+n+" elements :-");
        for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
        //Reversing the array and printing
        System.out.println("Printing the reversed array :-");
        for(int i:reverse(a,0,n-1))
            System.out.print(i+" ");
        scan.close();
    }
}
