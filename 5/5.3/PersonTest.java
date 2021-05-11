class Persona {
    public String name;
    public static int eyeNum;
}

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("Person 的eyeNum类变量值："
            + Persona.eyeNum);
        Persona p = new Persona();
        System.out.println("p变量的name变量值是：" + p.name
            + " p对象的eyeNum值为：" + p.eyeNum);
        p.name = "刘备";
        p.eyeNum = 2;

        System.out.println("p变量的name变量值是：" + p.name
            + " p对象的eyeNum值为：" + p.eyeNum);  
            
        System.out.println("Persona的eyeNum类变量值:" + Persona.eyeNum);
        Persona p2 = new Persona();
        System.out.println("p2对象的eyeNum类变量值：" + p2.eyeNum);
    }    
}
