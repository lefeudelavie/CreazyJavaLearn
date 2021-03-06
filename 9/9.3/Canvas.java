import java.util.*;


public class Canvas
{
    /*
    public void drawAll(List<Shape> shapes)
    {
         for (Shape s: shapes)
         {
              s.draw(this);
         }
    }
    */

    /*
    public void drawAll(List<?> shapes)
    {
        for (Object o: shapes)
        {
             Shape s = (Shape)o;
             s.draw(this);
        }
    }
    */

    public void drawAll(List<? extends Shape> shapes)
    {
        for (Shape s: shapes)
        {
             s.draw(this);
        }
    }

    public static void main(String[] args)
    {
        List<Circle> circlelist = new ArrayList<>();
        circlelist.add(new Circle());
        circlelist.add(new Circle());
        Canvas c = new Canvas();
        c.drawAll(circlelist);
    }
}
