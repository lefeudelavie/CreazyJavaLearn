public class Address
{
	private final String address;
	private final String postCode;

	public Address()
	{
		this.address = "";
		this.postCode = "";
	}

	public Address(String address, String postCode)
	{
		this.address = address;
		this.postCode = postCode;
	}


	public String getAddress()
	{
		return this.address;
	}

	public String getPostCode()
	{
		return this.postCode;
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;

		if (obj != null && obj.getClass() == Address.class)
		{
			Address tmp = (Address)obj;
			if (tmp.getAddress().equals(this.getAddress()) &&
				tmp.getPostCode().equals(this.getPostCode()))
				return true;
		}

		return false;

	}

	public int hascode()
	{
		return this.address.hashCode()  + this.postCode.hashCode() * 31;
	}

	public static void main(String[] args)
	{
		System.out.println("In the main");	
		Address o1 = new Address("God ave", "10010");
		Address o2 = new Address("God ave", "10010");
		System.out.println("Is o1 equals to o2:" + o1.equals(o2));
	}
}