import java.util.*;
public class Practice{
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(50);
        pq.offer(40);
        pq.offer(45);
        pq.offer(60);
        System.out.println(pq);
    }
}