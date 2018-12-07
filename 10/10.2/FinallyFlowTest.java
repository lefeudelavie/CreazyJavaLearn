public class FinallyFlowTest
{
    public static void main(String[] args) throws Exception
    {
	boolean res = test();
	System.out.println(res);
    }
   
    public static boolean test()
    {
     	try
	{
	    return true;     
	}
	finally
	{
	    return false;
	}
    }
}
