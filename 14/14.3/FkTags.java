import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FkTags
{
    FkTag[] value();
}

/* we still can use old style code to use above annotation 
@FkTags({@FkTag(age=5),
    @FkTag(name="Andy", age=9)})
*/

/* new style code to use it as repeat annotation
 @FkTag(age=5)
 @FkTag(name="test", age=9)
*/
