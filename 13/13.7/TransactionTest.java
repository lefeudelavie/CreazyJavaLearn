import java.sql.*;
import java.util.*;
import java.io.*;

public class TransactionTest
{
    private static String driver;
    private static String url;
    private static String user;
    private static String pass;
    public void initParam(String paramFile) throws Exception
    {
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("username");
        pass = props.getProperty("password");
    }

    public void insertInTransaction(String[] sqls) throws Exception
    {
        Class.forName(driver);
        try (
            Connection conn = DriverManager.getConnection(url, user, pass))
        {
            conn.setAutoCommit(false);
            try(
                Statement stmt = conn.createStatement())
            {
                for (String sql:sqls)
                {
                    stmt.executeUpdate(sql);
                }
            }

            conn.commit();
        }
    }

    public static void main(String[] args) throws Exception
    {
        TransactionTest tt = new TransactionTest();
        tt.initParam("mysql.ini");
        String[] sqls = new String[]
        {
            "insert into student_table values(null, 'aaa', 1)",
            "insert into student_table values(null, 'bbb', 1)",
            "insert into student_table values(null, 'ccc', 1)",

            "insert into student_table values(null, 'ccc', 5)",
        };
        tt.insertInTransaction(sqls);
    }
}
