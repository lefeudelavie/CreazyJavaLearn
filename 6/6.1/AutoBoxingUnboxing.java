public class AutoBoxingUnboxing
{
	public static void main(String[] args)
	{
		Integer intObj = 1;
		Object boolObj = true;
		int it = intObj;
		if ( boolObj instanceof Boolean)
		{
			Boolean b = (Boolean)boolObj;
			System.out.println("boolobj:" + boolObj);
		}
	}
}