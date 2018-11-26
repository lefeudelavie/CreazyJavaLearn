public class IntegerValTest
{

	public static void main(String[] args)
	{

		System.out.println("Hello World!");
		byte a = 56;
		System.out.println("byte a is:" + a);
		long bigVal = 9999999999999L;
		System.out.println("byte a is:" + bigVal);
		long bigVal2 = 9223372036854775807L;
		System.out.println("byte a is:" + bigVal2);

		int binVal1 = 0b11010100;
		int binVal2 = 0B01101001;
		int binVal3 = 0B10000000000000000000000000000011;

		byte binVal4 = (byte)0b11101001;

		long binVal5 = 0B10000000000000000000000000000011L;

		System.out.println(binVal1);
		System.out.println(binVal2);
		System.out.println(binVal3);
		System.out.println(binVal4);
		System.out.println(binVal5);


	}

}

