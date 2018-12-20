import java.sql.*;
import java.io.*;
import java.util.*;

public class ExecuteDDL
{
    private String driver;
    private String url;
    private String username;
    private String password;

    public void initParam(String paramFile)
        throws Exception
    {
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        username = props.getProperty("username");
        password = props.getProperty("password");
    }

    public void createTable(String sql) throws Exception
    {
        Class.forName(driver);
        try (
            Connection conn = DriverManager.getConnection(url,username, password);
            Statement stmt = conn.createStatement()
            )
        {
            stmt.executeUpdate(sql);
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        ExecuteDDL  ed = new ExecuteDDL();
        ed.initParam("mysql.ini");
        ed.createTable("create table jdbc_test"
                + "( jdbc_id int auto_increment primary key,"
                + "jdbc_name varchar(255),"
                + "jdbc_desc text);");
        System.out.println("----����ɹ�----");
    }
}
