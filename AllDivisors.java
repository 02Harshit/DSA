import java.util.*;
public class AllDivisors {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> l1=new ArrayList<>(); 
        // for(int i=1;i<=n/2;i++){
        //     if(n%i==0) System.out.println(i);
        // }
        // OPTIMIZED CODE :- (BY OBSERVATION)
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                l1.add(i);
                if(n/i != i) l1.add(n/i);
            }
            Collections.sort(l1);
            for(Integer j:l1){
                System.out.println(j);
            }
        }
        scan.close();
    }
}
