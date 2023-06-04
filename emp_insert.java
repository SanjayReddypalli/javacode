package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class emp_insert {
	public static void main(String[] args) 
	{
		
		try {
			Class. forName("com.mysql.cj.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/jdbc_tables";
			String user="root";
			String pwd="sanjay15";
			Connection con=	DriverManager.getConnection(url, user ,pwd); 
			Statement st= con.createStatement();
		Boolean b=	st.execute("insert into student values(105,'sanjay',9856740138)");
		
		con.close();
		if(!b)
		{
			System.out.println("in table values are inserted successfully");
		}
		else
		{
			System.out.println("failed");
		}
			
			
			
		}
		
		catch (ClassNotFoundException | SQLException e )
		{
			
			e.printStackTrace();
		} 
		}
		
	}