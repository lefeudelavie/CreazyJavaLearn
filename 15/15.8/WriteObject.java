import java.io.*;

public class WriteObject
{
    public static void main(String[] args)
    {
        try(
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("object.txt")))
        {
            Person per = new Person("Ëïºï×Ó", 500);
            oos.writeObject(per);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
