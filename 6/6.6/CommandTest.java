public class CommandTest
{
	public static void main(String[] args)
	{
		ProcessArray pa = new ProcessArray();
		int[] array = {1, 2, 3, 4, 5, 6};
		pa.process(array, new PrintCommand());
		pa.process(array, new AddCommand());
	}
}