import java.util.*;

public class ArrayDequeStack
{
	 public static void main(String[] args)
	 {
		 ArrayDeque stack = new ArrayDeque();
		 stack.add("Java book 101");
		 stack.add("Java book 102");
		 stack.add("Java book 103");
		 stack.push("OC book I");
		 stack.push("OC book II");
		 System.out.println(stack);
		 stack.pop();
		 System.out.println(stack);
		 System.out.println(stack.peek());
		 System.out.println(stack);

	 }
}
