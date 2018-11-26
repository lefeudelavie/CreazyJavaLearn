public class ConversionTest
{
	public static void main(String[] arags)
	{
		double d = 13.4;
		long l = (long)d;
		System.out.println(l);

		int in = 5;
		//boolean b = (boolean)in;

		Object obj = "Hello";
		String objStr = (String)obj;
		System.out.print(objStr);

		Object objPri = new Integer(5);
		// Object objPri = 5;
		// String str = (String)objPri;
	}
}