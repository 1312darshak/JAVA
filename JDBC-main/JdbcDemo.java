package jdbc;

//1.import the package-->phone-->sql package-->completed
//2.load or Register the driver-->sim Card-->"com.mysql.cj.jdbc.Driver"----forName();
//3.Establish the connection-->call the particular person-->static method-->get connection(parameter)
//4.Create the Statement-->prepare the question-->create statement();//three type - statement, prepared statement
//5.Execute the query-->Ask the question-->execute query();
//6.process the result-->Speak back
//7.close the connection-->hang up the call//close()

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/databl";
		String Username = "root";
		String Password = "21212";
		/*String query = "select empName from employee where empId = 2";*/
		String query = "select ' from employee";
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,Username,Password);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			String table = "";
			table = rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4);
			System.out.println(table);
			rs.next();
		}
		st.close();
		con.close(); 
		
	}

}
