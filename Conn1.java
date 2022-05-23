package mm;
import java.sql.*;

public class  Conn1
{

public Connection con;
private Statement st;
public Conn1()
	{
	try{
	       Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost/shop_pro", "root", "ROOT");
	       st=con.createStatement();

		System.out.println("connected Conn1 ");
		}
	catch(Exception e){
		System.out.println("Sorry Error Conn1"+e);
		}
	}

public ResultSet executeQuery(String sql) throws SQLException
	{
	return st.executeQuery(sql);
	}
public int executeUpdate(String sql) throws SQLException
	{
	return st.executeUpdate(sql);
	}
}
