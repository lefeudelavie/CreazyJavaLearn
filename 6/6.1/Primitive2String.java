class Primitive2String
{
	public static void main(String[] args)
	{
		String intStr = "12";
		int it1 = Integer.parseInt(intStr);
		int it2 = new Integer(intStr);
		System.out.println("it1 is:" + it1);
		System.out.println("it1 is:" + String.valueOf(it1));
		System.out.println(it2);

		String floatStr ="3.56";
		float ft1 = Float.parseFloat(floatStr);
		float ft2 = new Float(floatStr);
		System.out.println(ft2);

		String ftStr = String.valueOf(2.5558f);
		System.out.println(ftStr);

		String dbStr = String.valueOf(3.3444);
		System.out.println(dbStr);

		String boolStr = String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
	}
}