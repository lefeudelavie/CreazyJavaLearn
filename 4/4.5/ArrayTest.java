public class ArrayTest
{
	public static void main(String[] args)
	{
		int[] intArr;
		intArr = new int[] {5, 6, 7, 8, 9};
		System.out.println(intArr + "");

		for (int i = 0; i < 5 ;i++)
		{
			System.out.println(intArr[i]);
		}

		Object[] objArr;
		objArr = new String[] {"abc", "def"};
		Object[] objArr2;
		objArr2 = new Object[] {"123", "456"};

		for (int i = 0; i <2; i++)
		{
			System.out.println(objArr[i]);
		}

		for (int i = 0; i <2; i++)
		{
			System.out.println(objArr2[i]);
		}

		System.out.println("\n\n");

		String[] books = {"Book01", "Book02", "Book03"};
		for (String book :books)
			System.out.println(book);
	}
}