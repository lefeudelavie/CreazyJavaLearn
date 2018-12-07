class Apple<T extends Number>
{
     T size;
     public Apple() {};
     public Apple(T size)
     {
	  this.size = size;
     }

     public void setSize(T size)
     {
	  this.size = size;
     }

     public T getSize()
     {
	  return this.size; 
     }
}


public class ErasureTest
{
     public static void main(String[] args)
     {
	 Apple<Integer> a = new Apple<>(55);
	 Integer as = a.getSize();
	 System.out.println("a size is:" + as);
	 Apple b = a;
	 Number bs = b.getSize();
	 //Integer bs2 = b.getSize();
     }
}
