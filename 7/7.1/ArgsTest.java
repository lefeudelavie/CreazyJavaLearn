public class ArgsTest
{
	public static void main(String[] args)
	{
		System.out.println("Args length:" + args.length);
		for ( String tmp: args)
		{
			System.out.println(tmp);
		}
	}

}