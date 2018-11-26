class Student
{
	private String name;
	private String gender;
	private String address;
	private String email;
	private String phone;
	private int age;

	public void setName(String name)
	{
		if (name.length()> 20 || name.length() <= 0)
		{
			System.out.print("Your name length is invalid, should be between 0 and 20.");
			return;
		}
		else
		{
			this.name = name;
		}
	}

	public String getName()
	{
		if ( this.name.length() > 0)
			return this.name;
		else
		{
			System.out.println("Name has not set yet.");
			return "";
		}
	}

	public void setGender(String gender)
	{
		if (gender.equals("M") || gender.equals("F"))
		{
			this.gender = gender;
		}
		else 
		{
			System.out.println("Gender should be only set as M or F.");
			return;			
		}
	}

	public String getGender()
	{
		if ( gender.equals("M") || gender.equals("F"))
			return this.gender;
		else
		{
			System.out.println("The gender has not set yet.");
			return "";
		}

	}

	public void setAddress(String address)
	{
		if (address.length() > 100 || address.length() <= 0)
		{
			System.out.print("Your name length is invalid, should be between 0 and 100.");
			return;
		}
		else
		{
			this.address = address;
		}
	}

	public String getAddress()
	{
		if ( this.address.length() > 0 )
			return this.gender;
		else
		{
			System.out.println("The address has not set yet.");
			return "";
		}

	}

	public void setEmail(String email)
	{
		if (email.length() > 40 || email.length() <= 0)
		{
			System.out.print("Your email length is invalid, should be between 0 and 40.");
			return;
		}
		else
		{
			this.email = email;
		}
	}

	public String getEmail()
	{
		if ( this.address.length() > 0 )
			return this.email;
		else
		{
			System.out.println("The email has not set yet.");
			return "";
		}
	}

	public void setPhone(String phone)
	{
		if (phone.length() > 30 || phone.length() <= 0)
		{
			System.out.print("Your phone length is invalid, should be between 0 and 40.");
			return;
		}
		else
		{
			this.phone = phone;
		}
	}

	public String getPhone()
	{
		if ( this.phone.length() > 0 )
			return this.phone;
		else
		{
			System.out.println("The email has not set yet.");
			return "";
		}
	}

	public void setAge(int age)
	{
		if (age > 120 || age < 0)
		{
			System.out.print("Your age is invalid, should be between 0 and 120.");
			return;
		}
		else
		{
			this.age = age;
		}
	}

	public int getAge()
	{
		if ( this.age  >= 0 )
			return this.age;
		else
		{
			System.out.println("The age has not set yet.");
			return -1;
		}
	}

	public Student()
	{
		this.age = -1;
	}


	public Student(String name, String gender, String address, String email, String phone, int age)
	{
		this.setName(name);
		this.setGender(gender);
		this.setAddress(address);
		this.setEmail(email);
		this.setPhone(phone);
		this.setAge(age);
	}


	public void learning()
	{
		System.out.println("Student " + this.name + " is leanring.");
	}

	public boolean sendmail(String msg)
	{
		System.out.println("Mail has sent to student:" + this.name);
		return true;
	}


	public static void main(String[] args)
	{
		Student s = new Student("Aura", "M", "Cloud ave, Mandel county , France.", "Aura@163.com", "13922228888", 17);
		s.learning();
		s.sendmail("zzz");
	}
}