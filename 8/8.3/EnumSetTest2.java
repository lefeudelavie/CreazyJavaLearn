import java.util.*;

enum Season
{
    SPRING, SUMMER, AUTUM, WINTER
}

public class EnumSetTest2
{
    public static void main(String[] args)
    {
	HashSet hs = new HashSet();
	hs.clear();
	hs.add(Season.SPRING);
	hs.add(Season.SUMMER);
	hs.add(Season.AUTUM);

	System.out.println(hs);
	EnumSet es = EnumSet.copyOf(hs);
	System.out.println(es);
	// following code will be generate error
	hs.add("Book String");
	hs.add("Good boy");
	es = EnumSet.copyOf(hs);
    }
}

