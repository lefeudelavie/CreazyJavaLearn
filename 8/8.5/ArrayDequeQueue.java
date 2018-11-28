import java.util.*;

public class ArrayDequeQueue
{
	 public static void main(String[] args)
	 {
		 ArrayDeque queue = new ArrayDeque();
		 queue.offer("Economist");
		 queue.offer("Alalantic");
		 queue.offer("Observer");
		 queue.offer("good");

		 System.out.println(queue);
		 queue.poll();
		 System.out.println(queue.poll());
		 System.out.println(queue);
		 
	 }
}
