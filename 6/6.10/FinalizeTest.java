public class FinalizeTest
{
	public static FinalizeTest ft;
	public static void main(String[] args)
	{
		new FinalizeTest();
		System.gc();
		// Runtime.getRuntime().runFinalization();
		System.out.println("ft is:" + ft);
	}

	public void finalize()
	{
		ft = this;
	}
}
