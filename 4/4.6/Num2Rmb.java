import java.util.Arrays;

public class Num2Rmb
{
	private String[] chineseArr = {"零", "壹", "贰", "叁", "肆","伍", "陆", "柒", "捌","玖"};
	private String[] unitArr =    {"十","百","千","万","十","百","千","亿"};

	private String[] divide(double num)
	{
		long intPart = (long)num;
		long fracPart = Math.round((num - intPart) * 100);
		return new String[] {intPart + "", String.valueOf(fracPart)};
	}

	private String toChineseStr(String numStr)
	{
		String result = "";
		int numLen = numStr.length();

		for ( int i = 0; i < numLen; i++)
		{
			int num = numStr.charAt(i) - 48;
			if ( i != numLen - 1 && num != 0)
			{
				result += chineseArr[num] + unitArr[numLen - i - 2];
			}
			else 
			{
				if ( i == numLen -1 && num == 0)
					;
				else
					result += chineseArr[num];
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		Num2Rmb nr = new Num2Rmb();
		System.out.println(Arrays.toString(nr.divide(236711125.123)));

		System.out.println("需要转换成中文大写格式的数字为:" + "610901111");
		System.out.println(nr.toChineseStr("610901111"));
	}

}


