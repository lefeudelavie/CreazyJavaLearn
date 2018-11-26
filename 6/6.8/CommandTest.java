public class CommandTest
{
	public static void main(String[] args)
	{
		ProcessArray pa = new ProcessArray();
		int[] target = {1,2,3,4,5};
		pa.process(target, new Command(){
			public void process(int[] target)
			{
				int sum = 0;
				for (int tmp: target)
				{
					sum += tmp;
				}
				System.out.println("数列的和为：" + sum);
			}
		});
	}
}