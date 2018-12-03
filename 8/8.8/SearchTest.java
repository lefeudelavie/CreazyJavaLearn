import java.util.*;

public class SearchTest
{
     public static void main(String[] args)
     {
	 ArrayList nums = new ArrayList();
	 nums.add(9);
	 nums.add(-1);
	 nums.add(8);
	 nums.add(3);
	 nums.add(2);
	 nums.add(0);
	 nums.add(0);
	 System.out.println(nums);

	 System.out.println(Collections.max(nums));
	 System.out.println(Collections.min(nums));
	 Collections.replaceAll(nums,0, 1);
	 System.out.println(nums);
	 System.out.println(Collections.frequency(nums,1));
	 Collections.sort(nums);

	 System.out.println(nums);
	 System.out.println(Collections.binarySearch(nums, 8));

     }
}
