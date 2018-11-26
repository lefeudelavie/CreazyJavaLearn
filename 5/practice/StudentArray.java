import java.io.*;


class StudentArray
{
	private Student[] sarray;

	public int search( int type, String key)
	{
		if (type == 1)
		{
			for ( int i = 0; i < this.sarray.length ; i++ )
			{
				if (sarray[i].getName().equals(key) )
				{
					return i;
				}
			}
		}
		else if (type == 2)
		{
			for ( int i = 0; i < this.sarray.length ; i++ )
			{
				if (sarray[i].getEmail().equals(key) )
				{
					return i;
				}
			}
		}
		else if (type == 3)
		{
			for ( int i = 0; i < this.sarray.length ; i++ )
			{
				if (sarray[i].getAddress().equals(key) )
				{
					return i;
				}
			}
		}
		return -1;
	}

	public StudentArray(Student... students)
	{
		this.sarray = students;
	}

	public static void main(String[] args) throws Exception
	{
		BufferedReader inputer = new BufferedReader(new InputStreamReader(System.in));
		Student s1 = new Student("Aura", "M", "Cloud ave, Mandel county , France.", "Aura@163.com", "13922228888", 17);

		StudentArray stuArray = new StudentArray(s1);
		String inputStr = null;
		String inputKey = null;


		while (true)
		{
	        System.out.println("Please select the item you want use to do the search:");
			System.out.println("1. name");
			System.out.println("2. email");
			System.out.println("3. address");

            inputStr = inputer.readLine();
			int choice = Integer.parseInt(inputStr);

			System.out.println("Please input your search key:");
			inputKey = inputer.readLine();


			if ( stuArray.search(choice, inputKey) != -1)
			{
				System.out.println("You serach request just hit.");
			}
			else 
			{
				System.out.println("I am sorry, We cannot find the key you search.");
				System.out.println("Please try again.");
			}
		}
	}
}