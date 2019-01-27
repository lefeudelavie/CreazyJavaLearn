import java.lang.annotation.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

@Target(ElementType.TYPE_USE)
@interface NotNull{ } 

@NotNull
public class TypeAnnotationTest
    implements @NotNull Serializable
{
    public static void main(@NotNull String[] args)
        throws @NotNull FileNotFoundException
    {
        Object obj = "andydu.org";
        String str = (@NotNull String)obj;
        Object win = new @NotNull JFrame("����Type Annotation");
    }

    public void foo(List<@NotNull String> info){}
}
