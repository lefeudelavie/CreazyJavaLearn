import javax.swing.JFrame;

@FunctionalInterface
interface Converter
{
	Integer convert(String from);
}

@FunctionalInterface
interface Mytest
{
	String test(String a, int b, int c);
}


@FunctionalInterface
interface YourTest
{
	JFrame win(String title);
}

public class MethodRefer
{
	public static void main(String[] args)
	{
	 
		// 写法一
		Converter converter1 = (Converter)(from) -> Integer.valueOf(from);
		int a = converter1.convert("99");
		System.out.println("a is:" + a);

		//写法二
		Converter converter2 = from -> Integer.valueOf(from);
		int b = converter1.convert("88");
		System.out.println("b is:" + b);	

		Converter converter3 = Integer::valueOf;	
		int c = converter1.convert("77");
		System.out.println("c is:" + c);	

		Converter converter4 = from -> "fkit.org".indexOf(from);
		int  d = converter4.convert("it");
		System.out.println("d is:" + d);	

		Converter converter5 = "fkit.org"::indexOf;
		d = converter4.convert("it");
		System.out.println("d is:" + d);	
 
		//////////////////////////////////////
		Mytest tester1 = (j,h,i) -> j.substring(h, i);
		String e = tester1.test("I Love this world!", 2, 6);
		System.out.println("e is:" + e);

		Mytest tester2 = String::substring;
		e = tester2.test("I Love this countery", 2, 6);
		System.out.println("e is:" + e);


		///////////////////////////
		YourTest yt = (String a2) -> new JFrame(a2);
		JFrame jf = yt.win("我的窗口");
		System.out.println(jf);


		YourTest yt2 = JFrame::new;
		JFrame jf2 = yt.win("My windows");
		System.out.println(jf2);
		jf.show();
		jf2.show();
	}
}