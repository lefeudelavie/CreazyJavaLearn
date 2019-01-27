import java.util.*;
import java.io.*;
import java.sql.*;
import javax.sql.rowset.*;
import com.sun.rowset.*;

public class JdbcRowSetTest
{
    private String driver;
    private String url;
    private String user;
    private String pass;
    public void initParam(String paramFile) throws Exception
    {
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("username");
        pass = props.getProperty("password");
    }

    public void update(String sql) throws Exception
    {
        Class.forName(driver);
        try(
            Connection conn = DriverManager.getConnection(url, user, pass);
            JdbcRowSet jdbcRs = new JdbcRowSetImpl(conn))
        {
            jdbcRs.setCommand(sql);
            jdbcRs.execute();

            jdbcRs.afterLast();
            while (jdbcRs.previous())
            {
                System.out.println(jdbcRs.getString(1)
                        + "\t" + jdbcRs.getString(2)
                        + "\t" + jdbcRs.getString(3));
                if (jdbcRs.getInt("student_id") == 3 )
                {
                    jdbcRs.updateString("student_name", "ËïÎò¿Õ");
                    jdbcRs.updateRow();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        JdbcRowSetTest jt = new JdbcRowSetTest();
        jt.initParam("mysql.ini");
        jt.update("select * from student_table");
    }
}
