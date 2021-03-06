import java.util.*;
import java.sql.*;
import javax.sql.*;
import java.io.*;
import javax.sql.rowset.*;

public class CachedRowSetPage
{
    private static String driver;
    private static String url;
    private static String user;
    private static String pass;
    
    public static void initParam(String paramFile) throws Exception
    {
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("username");
        pass = props.getProperty("password");
    }

    public CachedRowSet query(String sql, int pageSize, int page) throws Exception
    {
        Class.forName(driver);
        try (
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql))
        {
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet cachedRs = factory.createCachedRowSet();
            
            cachedRs.setPageSize(pageSize);
            cachedRs.populate(rs, (page -1) * pageSize + 1);
            return cachedRs;
            
        }
    }

    public static void main(String[] args) throws Exception
    {
        CachedRowSetPage crsp = new CachedRowSetPage();
        crsp.initParam("mysql.ini");
        CachedRowSet rs = crsp.query("select * from student_table", 3, 2);

        while (rs.next())
        {
            System.out.println(rs.getString(1)
                    + "\t" + rs.getString(2)
                    + "\t" + rs.getString(3));
        }
    }

}
