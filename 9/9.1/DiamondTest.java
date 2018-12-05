import java.util.*;

public class DiamondTest
{
     public static void main(String[] args)
     {
	 List<String> books = new ArrayList<>();
	 books.add("如何做一个好人");
	 books.add("如何实践强化学习");
	 books.add("如何有效沟通");
	 System.out.println(books);
	 books.forEach(ele -> System.out.println(ele.length()));

	 Map<String, List<String>> schoolsInfo = new HashMap<>();

	 List<String> schools = new ArrayList<>();
	 schools.add("医学院");
	 schools.add("法学院");
	 schools.add("理学院");
	 schoolsInfo.put("大学生甲", schools);
	 schoolsInfo.forEach( (key,value) -> System.out.println(key + "---->" + value));
	 schoolsInfo.forEach( (key,value) -> value.forEach(ele -> System.out.println(ele.length())));

     }
}
