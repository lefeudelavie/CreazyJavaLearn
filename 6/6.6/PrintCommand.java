public class PrintCommand implements Command
{
	public void process(int[] args)
	{
		for(int i: args)
		{
			System.out.println("Output the array's element :" + i);
		}
	}

}