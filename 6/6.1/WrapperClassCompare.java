class WrapperClassCompare
{
	public static void main(String[] args)
	{
		Integer a = new Integer(3);
		System.out.println("a是否大于2.0? " + (a > 2.0));

		System.out.println("比较两个包装类: new Integer(3) new Interger(3) 是否相等:" + (new Integer(3) == new Integer(3)));

		Integer ia = 3;
		Integer ib = 3;
		System.out.println("比较两个自动包装: Integer ia = 3, Interger ib =3, ia,ib 是否相等:" + (ia == ib));

		Integer ic = 128;
		Integer id = 128;
		System.out.println("比较两个自动包装: Integer ic = 128, Interger id =128, ia,ib 是否相等:" + (ic == id));
		System.out.println("比较两个自动包装: Integer ic = 128, Interger id =128, Integer.compare(ic,id) :" + Integer.compare(ic , id));

	}
}