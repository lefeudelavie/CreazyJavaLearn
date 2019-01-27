import java.util.*;
import java.io.*;
import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;

public class CachedRowSetTest
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

    public CachedRowSet query(String sql) throws Exception
    {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, pass);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        RowSetFactory factory = RowSetProvider.newFactory();

        CachedRowSet cachedRs = factory.createCachedRowSet();

        cachedRs.populate(rs);
        rs.close();
        stmt.close();
        conn.close();
        return cachedRs;
    }

    public static void main(String[] args) throws Exception
    {
        CachedRowSetTest ct = new CachedRowSetTest();
        ct.initParam("mysql.ini");
        CachedRowSet rs = ct.query("select * from student_table");
        rs.afterLast();

        while (rs.previous())
        {
            System.out.println(rs.getString(1)
                    + "\t" + rs.getString(2)
                    + "\t" + rs.getString(3));
            if (rs.getInt("student_id") == 3)
            {
                rs.updateString("student_name", "ÀÔ¥Û •");
                rs.updateRow();
            }

            Connection conn = DriverManager.getConnection(url, user, pass);
            conn.setAutoCommit(false);
            rs.acceptChanges(conn);
        }
    }
}
