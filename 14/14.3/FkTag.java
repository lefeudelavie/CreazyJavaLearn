import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(FkTags.class)
public @interface FkTag
{
    String name() default "�ظ�ע�����";
    int age();
}

/* old style container to implement repeat annotation
@Results({@Result(name="failure", location="failed.jsp"),
@Result(name="success", location="succ.jsp")})
public Action FooAction{ ... }
*/

/* new style to do repeat annotation in java 8
@Result(name="failure", location="failed.jsp")
@Result(name="success", location="succ.jsp")
public Action FooAction{ ... }
*/
