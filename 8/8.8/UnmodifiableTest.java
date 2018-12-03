import java.util.*;

public class UnmodifiableTest
{
	 public static void main(String[] args)
	 {
		 List unmodifiableList = Collections.emptyList();

		 Set unmodifiableSet =  Collections.singleton("Learn Java");

		 HashMap scores = new HashMap();
		 scores.put("C programming" , 98);
		 scores.put("Decrete Math" , 88 );
		 scores.put("Algorithms" , 78 );

		 Map unmodifiableMap = Collections.unmodifiableMap(scores);

		 System.out.println(unmodifiableList);
		 System.out.println(unmodifiableSet);
		 System.out.println(unmodifiableMap);

		 unmodifiableList.add("Test");
		 unmodifiableSet.add("Test");
		 unmodifiableMap.put("Math", 88);

	 }
}
