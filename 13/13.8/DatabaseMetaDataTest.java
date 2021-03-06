import java.util.*;
import java.io.*;
import java.sql.*;


public class DatabaseMetaDataTest
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

    public void info() throws Exception
    {
        Class.forName(driver);
        try(
            Connection conn = DriverManager.getConnection(url, user, pass))
        {
            // get DatabaseMetaData object dbmd
            DatabaseMetaData dbmd = conn.getMetaData();
            // get data types supported by mysql
            ResultSet rs = dbmd.getTableTypes();
            System.out.println("--当前数据库支持的数据表信息--");
            printResultSet(rs);
            // get all the tables of current databases;
            rs = dbmd.getTables(null, null, "%", new String[]{"TABLE"});
            System.out.println("--当前数据库里的数据表信息--");
            printResultSet(rs);
            // get table primary key in table "student_table" 
            rs = dbmd.getPrimaryKeys(null, null, "student_table");
            System.out.println("--student_table表的主键信息--");
            printResultSet(rs);
            // get all the store procedures in the database
            rs = dbmd.getProcedures(null, null, "%");
            System.out.println("--当前数据库中所有存储引擎--");
            printResultSet(rs);
            // get foreign keys between teacher_table and student_table
            rs = dbmd.getCrossReference(null, null, "teacher_table"
                    , null, null, "student_table");
            System.out.println("--teacher_table和student_table表之间的外键约束--");
            printResultSet(rs);
            // get all the data columns in the student_table
            rs = dbmd.getColumns(null,  null, "teacher_table", "%");
            System.out.println("--student_table表的全部数据列--");
            printResultSet(rs);
        }

        
    }
    
    public void printResultSet(ResultSet rs) throws SQLException
    {
        ResultSetMetaData rsmd = rs.getMetaData();
        // print ResultSet's column title
        for (int i = 0; i < rsmd.getColumnCount(); i++ )
        {
            System.out.print(rsmd.getColumnName(i + 1) + "\t");
        }

        System.out.print("\n");
        // print all the data in ResultSet
        while (rs.next())
        {
            for (int i = 0; i < rsmd.getColumnCount(); i++)
            {
                System.out.print(rs.getString(i + 1) + "\t");
            }
            System.out.print("\n");
        }
        rs.close();
    }

    public static void main(String[] args) throws Exception
    {
        DatabaseMetaDataTest dt = new DatabaseMetaDataTest();
        dt.initParam("mysql.ini");
        dt.info();
    }
    
}
