import java.sql.*;
import java.util.*;
import java.io.*;

public class CallableStatementTest
{
    private String driver;
    private String url;
    private String user;
    private String pass;

    public void initParam(String paramFile) throws Exception
    {
	Properties props = new Properties();
	props.load(new FileInputStream(paramFile));
	dirver = props.getProperty("driver");
	url = props.getProperty("url");
	user = props.getProperty("user");
	pass = props.getProperty("pass");
    }

    public void callProcedure() throws Exception
    {
	Calss.forName(driver);
	try(
	    Connection conn = DriverManager.getConnection(url,
		user, pass);
	    CallableStatement cstmt = conn.prepareCall(
		"{call add_pro(?, ?, ?)}"))
	   {
		cstmt.setInt(1, 4);
		cstmt.setInt(2, 5);

		cstmt.registerOutParameter(3, Types.INTEGER);
		cstmt.execute();
		System.out.println("执行结果是：" + cstmt.getInt(3));
	   }
    }

    public static void main(String[] args)
    {
	CallableStatementTest ct = new CallableStatement();
	ct.initParam("mysql.ini");
	ct.callProcedure();
    }
}
