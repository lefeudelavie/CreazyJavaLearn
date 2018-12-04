import java.util.*;


public class ListTest
{
     public static void main(String[] args)
     {
        ArrayList books = new ArrayList();
        books.add("Java programing 101");
        books.add("OC programing 101");
        books.add("Design mode 101");
        System.out.println(books);
        books.add("不疯魔，不成活！");
        for ( Object book: books)
        {
             System.out.println(book);
        }

        System.out.println("\n");

        for (int i = 0; i<books.size(); i++)
        {
             System.out.println(books.get(i));
        }

        books.remove(1);
        System.out.println(books);

        System.out.println(books.indexOf(new String("Design mode 101")));

        books.set(1,"INDEX 111 BOOK");
        System.out.println(books);


        System.out.println(books.subList(1,2));
     }
}
