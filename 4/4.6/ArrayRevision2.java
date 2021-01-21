import java.util.Arrays;
import java.util.function.*;

public class ArrayRevision2 {
   public static void main(String[] args) {
        int[] tArr1 = new int[]{3, -4, 5, 2, 9,10,8};
        Arrays.parallelSort(tArr1);
        System.out.println(Arrays.toString(tArr1));

        int[] tArr2 = new int[]{7, 9, -3, 8, 2, 8};
        Arrays.parallelPrefix(tArr2, new IntBinaryOperator()
        {
           public int applyAsInt(int left, int right)
           {
               return left * right;
           } 
        });
        System.out.println(Arrays.toString(tArr2));

        Arrays.parallelSetAll(tArr2, new IntUnaryOperator()
        {
            public int applyAsInt(int operand)
            {
                return operand * 5;
            }   
        });

        System.out.println(Arrays.toString(tArr2));
   } 
}
