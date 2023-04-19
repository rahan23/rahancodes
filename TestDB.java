import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {

	public static void main(String[] args) {
		
		try
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Drive Found");
        Connection connection=DriverManager.getConnection(
        		"jdbc:mysql://localhost:3306/rahan","root","root");
        System.out.println("Connection Success");
        Statement statement=connection.createStatement();		
        
        ResultSet rs=statement.executeQuery("SELECT * FROM rahan.studentdata;");
		while(rs.next())
        {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
		
