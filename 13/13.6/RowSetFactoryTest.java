import java.util.*;
import java.io.*;
import java.sql.*;
import javax.sql.rowset.*;

public class RowSetFactoryTest
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
        RowSetFactory factory = RowSetProvider.newFactory();
        try (
                JdbcRowSet jdbcRs = factory.createJdbcRowSet())
        {
            jdbcRs.setUrl(url);
            jdbcRs.setUsername(user);
            jdbcRs.setPassword(pass);

            jdbcRs.setCommand(sql);
            jdbcRs.execute();

            jdbcRs.afterLast();
            while (jdbcRs.previous())
            {
                System.out.println(jdbcRs.getString(1)
                        + "\t" + jdbcRs.getString(2)
                        + "\t" + jdbcRs.getString(3));
                if (jdbcRs.getInt("student_id") == 3)
                {
                    jdbcRs.updateString("student_name", "ÀÔ––’ﬂ");
                    jdbcRs.updateRow();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        RowSetFactoryTest rsft = new RowSetFactoryTest(); 
        rsft.initParam("mysql.ini");
        rsft.update("select * from student_table");
    }
}
