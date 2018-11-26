import java.lang.ref.WeakReference;

public class ReferenceTest
{

	public static void main(String[] args) throws Exception
	{
		String str = new String("this");
		WeakReference wr = new WeakReference(str);
		str = null;
		System.out.println(wr.get());

		System.gc();
		System.runFinalization();
		System.out.println(wr.get());
	}
}