public class IntegerCacheTest
{
	public static void main(String[] args)
	{
		Integer in1 = new Integer(6);
		Integer in2 = Integer.valueOf(6);

		Integer in3 = Integer.valueOf(6);
		System.out.println("Is in1 == in2 : " + (in1 == in2));
		System.out.println("Is in2 == in3 : " + (in2 == in3));

		Integer in4 = new Integer(128);
		Integer in5 = Integer.valueOf(128);
		System.out.println("Is in4 == in5 :" + (in4 == in5));
	}
}