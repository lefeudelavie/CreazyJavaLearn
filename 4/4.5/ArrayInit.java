public class ArrayInit {
    public static void main(String[] args){
        // static init
        int[] a = {1,2,3,4,5,6};
        int[] b = new int[] {10, 9, 8, 7, 6, 5, 4};
        int i;
        for (i=0; i < 6; i++){
            System.out.println(a[i]);
        }
        System.out.println("");
        for (i=0; i< 7; i++){
            System.out.println(b[i]);
        }
        System.out.println("");
        // dynamic init
        float[] c = new float[10];
        for (i = 0; i < 10; i++) {
            System.out.println(c[i]);
        }
        System.out.println("");
        // static init
        String[] d = {"str1", "str2", "str3", "str4", "str5"};
        for (i = 0; i < 5; i++) {
            System.out.println(d[i]);
        } 
        System.out.println("");
        // dynamic init
        String[] e = new String[10];
        for (i = 0; i < 10; i++) {
            System.out.println(e[i]);
        }         
    }
}
