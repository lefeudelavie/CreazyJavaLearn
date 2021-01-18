import java.util.Arrays;

public class ArrayBasicRevision {
   public static void main(String[] args){
       // 静态初始化
       int[] iArr = {1,2,3,4,5};
       // int j;
       for (int j: iArr)
       {
           System.out.println(j);
       }
       System.out.println("####1###");
       // 动态初始化
       int[] jArr = new int[10];
       for (int j: jArr){
           System.out.println(j);
       }
       System.out.println("####2###");
       // 引用赋值
       jArr = iArr;
       for (int j:jArr ){
           System.out.println(j);
       }

       // Arrays的用法
       int[] testArr1 = {1,5,7,3,2,0};
       int[] testArr2= {1,5,7,3,1,9};
       System.out.println("数组testArr1与testArr2是否相等：" + Arrays.equals(testArr1, testArr2));
       
       int[] testCopyArr1 = Arrays.copyOf(testArr1, 6);
       System.out.println("数组testArr1与testCopyArr1是否相等:" + Arrays.equals(testArr1, testCopyArr1));
       
       // 转换数组为字符串 
       System.out.println("数组testArr1:" + Arrays.toString(testArr1));

       // 对数组进行排序
       Arrays.sort(testArr1);
       System.out.println("数组testArr1:" + Arrays.toString(testArr1));

       
   } 
}
