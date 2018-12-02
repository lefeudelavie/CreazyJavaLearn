import java.util.*;

enum Season
{
	 SPRING, SUMMER, AUTUM, WINTER;
}

public class EnumMapTest
{
	 public static void main(String[] args)
	 {
		 EnumMap em = new EnumMap(Season.class);
		 em.put(Season.AUTUM, "秋高气爽");
		 em.put(Season.SPRING, "春光明媚");
		 em.put(Season.SUMMER, "酷热难耐");
		 System.out.println(em);
	 }
}
