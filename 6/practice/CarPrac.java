abstract class Automobile 
{
	private double speed;
	private double weight;

	public void setSpeed(double speed)
	{
		this.speed = speed;
	}

	public double getSpeed() 
	{
		return this.speed;
	}

	public abstract void startEngine();
	public abstract void speedUp();
	public abstract void stopEngine();
}

class Tractor extends Automobile
{
	public void startEngine()
	{
		System.out.println("拖拉机在启动。");
	}

	public void stopEngine()
	{
		System.out.println("拖拉机停止发动。");
	}


	public void speedUp()
	{
		System.out.println("拖拉机在加速。");
	}

}

class Truck extends Automobile
{
	public void startEngine()
	{
		System.out.println("卡车在启动。");
	}

	public void stopEngine()
	{
		System.out.println("卡车停止发动。");
	}


	public void speedUp()
	{
		System.out.println("卡车在加速。");
	}

}

class  Car extends Automobile
{
	public void startEngine()
	{
		System.out.println("小汽车在启动。");
	}

	public void stopEngine()
	{
		System.out.println("小汽车停止发动。");
	}


	public void speedUp()
	{
		System.out.println("小汽车在加速。");
	}

}

public class CarPrac
{
	public static void main(String[] args)
	{

		new Truck().startEngine();
		new Tractor().stopEngine();
		new Car().speedUp();
	}
}

