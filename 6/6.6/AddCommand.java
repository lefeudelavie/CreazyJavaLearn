public class AddCommand implements Command
{
	public void process(int[] args)
	{
		int sum = 0;
		for (int tmp: args)
		{
			sum += tmp;
		}
		System.out.println("Sum is:" + sum);
	}
}