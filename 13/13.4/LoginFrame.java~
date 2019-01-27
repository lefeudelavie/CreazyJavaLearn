import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.awt.*;

public class LoginFrame
{
    private final String PROP_FILE = "mysql.ini";
    private String driver;

    private String url;
    private String username;
    private String password;
    
    private JFrame jf = new JFrame("登录");
    private JTextField userField = new JTextField(20);
    private JTextField passField = new JTextField(20);
    private JButton loginButton = new JButton("登陆");
    
    public void init() throws Exception
    {
        Properties connProp = new Properties();
        connProp.load(new FileInputStream(PROP_FILE));
        driver = connProp.getProperty("driver");
        url = connProp.getProperty("url");
        username = connProp.getProperty("username");
        password = connProp.getProperty("password");

        Class.forName(driver);

        loginButton.addActionListener( e -> {
            if (validate(userField.getText(), passField.getText()))
            {
                JOptionPane.showMessageDialog(jf, "登录成功");
            }
            else
            {
                JOptionPane.showMessageDialog(jf, "登录失败");
            }
        });

        jf.add(userField, BorderLayout.NORTH);
        jf.add(passField);
        jf.add(loginButton, BorderLayout.SOUTH);
        jf.pack();
        jf.setVisible(true);
    }

    private boolean validate(String userName, String userPass)
    {
        /* 下面的写法会被SQL注入
        String sql = "select * from jdbc_test"
            + " where jdbc_name='" + userName
            + "' and jdbc_desc='" + userPass + "'";
        System.out.println("sql:" + sql);
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
            )
        {
            if (rs.next())
            {
                return true;
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return false;
        */


        //用PreparedStatement来执行验证，可以防止被SQL注入
        try(
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = conn.prepareStatement(
                "select * from jdbc_test where jdbc_name = ? and jdbc_desc= ?")
        )
        {
            pstmt.setString(1, userName);
            pstmt.setString(2, userPass);
            try(
                 ResultSet rs = pstmt.executeQuery();
            )
            {
                if (rs.next())
                {
                    return true;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;

    }

    public static void main(String[] args) throws Exception
    {
        new LoginFrame().init();
    }
    
}
