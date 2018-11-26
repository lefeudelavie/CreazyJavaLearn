public class CommandTest2
{
	public static void main(String[] args)
	{
		ProcessArray pa = new ProcessArray();
		int[] array = new int[]{1,2,3,4,5,6};
		pa.process(array, (int[] target) -> {
			int sum = 0;
			for (int tmp:target)
			{
				sum += tmp;
			}
			System.out.println("Sum is:" + sum);
		});
	}
}