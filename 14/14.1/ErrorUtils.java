import java.util.*;
/**
 * Description:
 * <br>Copyright(C), 2012-2020, Andy.A.Du
 * <br>This probram is protected by copyright law
 * <br>Program Name:
 * <br>Date:
 * @author Andy.A.Du lefeudelavie@163.com
 * @version 1.0
 */
public class ErrorUtils
{
    @SafeVarargs
    public static void faultyMethod(List<String>... listStrArray)
    {
        List[] listArray = listStrArray;
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(new Random().nextInt(100));
        listArray[0] = myList;
        String s = listStrArray[0].get(0);
    }
}
