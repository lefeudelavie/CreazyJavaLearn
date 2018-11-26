public class BetterPrinter
{
	private String[] printData
		= new String[MAX_CACHE_LINE *2];
	private int dataNum = 0;

	public getData(String msg)
	{
		if (dataNum > MAX_CACHE_LINE * 2)
		{
			System.out.println("队列已满，无法再添加任务")	;
		}
		else
		{
			printData[dataNum++] = msg;
		}
	}

	public out()
	{
		while (dataNum > 0)
		{
			System.out.println("正在打印：" + printData[0]);
			System.arraycopy(printData, 0, printData, 1, dataNum--);
		}
	}
}