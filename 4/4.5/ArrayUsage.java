public class ArrayUsage {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int i;
        for (i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        String[] book = {"History of today", "History of human being", "History of future"};
        for (i = 0; i < book.length; i++)
        {
            System.out.println(book[i]);
        }
        System.out.println();
        for (String j: book){
            System.out.println(j);
        }
    }

}
