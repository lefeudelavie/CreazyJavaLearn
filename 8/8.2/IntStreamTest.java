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
		//System.out.println("is 所有的元素的平方是否都大于20:"
		//					 + is.allMatch(ele -> ele * ele >20));
		// System.out.println("is 是否包含任何元素的平方大于20:"
		// 					+ is.anyMatch(ele -> ele * ele > 20	));
		//IntStream newIs = is.map(ele -> ele * 2 + 1);
		//newIs.forEach(System.out::println);
		//System.out.println("is 有任何元素大于20：" 
		//					+ newIs.anyMatch(ele -> ele > 20));
		System.out.println("过滤掉所有大于20的元素:" + is.filter(ele -> ele > 20));
		//is.forEach(System.out::println);
	}
}
