import java.sql.*;
import java.util.Scanner;

public class TestMYdb {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Drive found");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahan ","root","root");
		System.out.println("Connection Success");
		Statement statement=connection.createStatement();  //to run query
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter id and name to update");
		int x=scanner.nextInt();
		String an=scanner.next();
		String sa=scanner.next();
		String uQuery="INSERT INTO `rahan`.`student_data` (`ID`, `Name`, `Address`) VALUES ('"+x+"', '"+an+"', '"+sa+"')";
				
		statement.executeUpdate(uQuery);
		System.out.println("Data Updated");
		
		
		
		
		
		
		
		
		
//		System.out.println("Enter ID, Name and Address");
//		int ID=scanner.nextInt();
//		String Name=scanner.next();
//		String Address=scanner.next();
//		
//		String query="INSERT INTO student_data('ID', 'name', 'Address') VALUES('"+ID"' ,'"+Name+"','"+Address+"');"
//				statement.executeUpdate

		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}