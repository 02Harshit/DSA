import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println(false);
            sc.close();
            return;
        }
        int orig_num=n;
        int rev_num=0;
        while(n>0){
            int ld=n%10;
            rev_num=(rev_num*10) + ld;
            n=n/10;
        }
        if(rev_num==orig_num) System.out.println(true);
        else System.out.println(false);
        sc.close();
    }
}
// BEST SOLUTION 
// public boolean isPalindrome(int x) {
//     if(x<0){
//         return false;
//     }
//     int r=0;
//     int a=x;
//     while(x>0){
//         r=(r*10)+(x%10);
//         x/=10;
//     }
//     return a==r;