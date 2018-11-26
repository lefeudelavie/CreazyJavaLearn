class Vehicle
{
	protected int weight;
	protected int volume;
	protected int capacity;
	protected int speedLimit;

	protected int speed;
	protected String color;
	protected String energyType;

	protected String newDegree;
	{
		this.newDegree= "New";
	}

	public int getCapacity()
	{
		return this.capacity;
	}


	public int getSpeed()
	{
		return this.speed;
	}

	public String getNewDegree()
	{
		return this.newDegree;
	}
}


class LandVehicle extends Vehicle
{
	public static String landVehicleLaw = "Land vehicle Law 2010";

	protected int numOfWheel;
	protected int numOfCarriage;

	public void run()
	{
		System.out.println("Now, the car is running.");
	}
}


class AirVehicle extends Vehicle
{
	public static String airVehicleLaw = "Air vehicle Law 2010";
	protected int heightLimit;
	protected int height;

	public void fly()
	{

	}
}


class Car extends LandVehicle
{
	private int power;
	private String controlType;
	private int useYears;
	private int numOfEnergy;

	{
		this.numOfWheel = 4;
		this.energyType = "gasonline" ;
		this.numOfCarriage = 2;
		this.controlType = "manual";
		this.useYears = 0;
	}

	public Car()
	{

	}

	public Car(int speedLimit, int weight, int volume, int capacity, String color)
	{
		this.speedLimit = speedLimit;
		this.weight = weight;
		this.volume = volume;
		this.capacity = capacity;
		this.color = color;
	}

	public Car(int speedLimit, int weight, int volume, int capacity, String color, int numOfWheel, int numOfCarriage, String energyType, String controlType, int numOfEnergy)
	{
		this.speedLimit = speedLimit;
		this.weight = weight;
		this.volume = volume;
		this.capacity = capacity;
		this.color = color;
		this.numOfWheel = numOfWheel;
		this.numOfCarriage = numOfCarriage;
		this.energyType = energyType;
		this.controlType = controlType;
		this.numOfEnergy = numOfEnergy;
	}

	public String toString()
	{
		return "一部汽车：" + this.numOfWheel + "个轮子。烧" +  this.energyType + "有" + this.numOfCarriage + "个车厢，"
			   + "限速" + this.speedLimit + "公里每小时。"  + this.controlType + "动档。"; 
	}

	public static void main(String[] args)
	{
		System.out.println("In the main.");
		Car car_01 = new Car();
		System.out.println(car_01);
		Car car_02 = new Car(100, 2000, 5, 4, "white");
		System.out.println(car_02);
	}
}


class Train extends LandVehicle
{
	private int power;
	private int speedType; 
	{
		this.numOfWheel = 400;
		this.numOfCarriage = 18;
		this.energyType = "electricity" ;
	}


}


class Plane extends AirVehicle
{
	public Plane(int heightLimit, int speedLimit)
	{

	}

	public Plane(int heightLimit, int speedLimit, int weight, int volume, int capacity, String color)
	{

	}


}