import java.sql.*;

public class ConnMySql
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        try (
                Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.19:3306/select_test"
                    , "alex" , "Rolland2011");

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select s.* , teacher_name"
                    + " from student_table s, teacher_table t"
                    + " where t.teacher_id = s.java_teacher"))
        {
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + "\t"
                        + rs.getString(2) + "\t"
                        + rs.getString(3) + "\t"
                        + rs.getString(4));
            }
        }
    }
}
