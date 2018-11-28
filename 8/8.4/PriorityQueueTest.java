import java.util.*;

public class PriorityQueueTest
{
     public static void main(String[] args)
     {
	 PriorityQueue pq = new PriorityQueue();
	 pq.offer(-2);
	 pq.offer(3);
	 pq.offer(-9);
	 pq.offer(5);
	 System.out.println(pq);
	 System.out.println("");
	 pq.forEach(System.out::println);
	 System.out.println("");
	 System.out.println(pq.poll());
     }
}
