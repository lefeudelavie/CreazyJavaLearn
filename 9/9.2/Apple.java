public class Apple<T>
{
     private T info;
     public Apple(){};

     public Apple(T info)
     {
	  this.info = info;
     }

     public T getInfo()
     {
	  return this.info;
     }

     public void setInfo(T info)
     {
	  this.info = info;
     }

     public static void main(String[] args)
     {
	 Apple<String> ap = new Apple<>("苹果");
	 System.out.println(ap.getInfo());

	 Apple<Double> ap2 = new Apple<>(13.5);
	 System.out.println(ap2.getInfo());
     }
}
