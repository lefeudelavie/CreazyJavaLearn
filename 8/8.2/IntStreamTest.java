import java.util.stream.*;

public class IntStreamTest
{
	public static void main(String[] args) 
	{
		IntStream is = IntStream.builder()
		.add(20)
		.add(30)
		.add(13)
		.add(-2)
		.add(20)
		.build();

		//System.out.println("is 所有元素的最大值:" + is.max().getAsInt());
		//System.out.println("is 所有元素的最小值:" + is.min().getAsInt());
		//System.out.println("is 所有元素的总和:" + is.sum());
		//System.out.println("is 所有元素的平均值:" + is.average().getAsDouble());

	}
}
