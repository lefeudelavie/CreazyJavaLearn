import java.lang.reflect.*;

public class ProcessorTest
{
    public static void process(String clazz)
        throws ClassNotFoundException
    {
        int passed = 0;
        int failed = 0;

        for (Method m: Class.forName(clazz).getMethods())
        {
            if (m.isAnnotationPresent(Testable.class))
            {
                try
                {
                    m.invoke(null);
                    passed++;
                }
                catch (Exception ex)
                {
                    System.out.println("����" + m + "����ʧ�ܣ��쳣��"
                            + ex.getCause());
                    failed++;
                }
            }
        }

        System.out.println("�ܹ������ˣ�" + (passed + failed) 
                + "�����������У�\n" + "ʧ���ˣ�" + failed + "����\n"
                + "�ɹ��ˣ�" + passed + "����");
    }
}
