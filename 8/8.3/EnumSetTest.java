import java.util.*;

enum Season
{
    SPRING, SUMMER, AUTUM, WINTER
}

public class EnumSetTest
{
    public static void main(String[] args)
    {
	EnumSet es1 = EnumSet.allOf(Season.class); 
	System.out.println(es1);
	EnumSet es2 = EnumSet.noneOf(Season.class);
	es2.add(Season.WINTER);
	es2.add(Season.SUMMER);
	System.out.println(es2);
	EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
	System.out.println(es3);
	EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
	System.out.println(es4);
	EnumSet es5 = EnumSet.complementOf(es4);
	System.out.println(es5);	

    }
}
