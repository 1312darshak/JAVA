package jdbc;

//prepared Statement - update the value 
import java.sql.*;

public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/databl";
		String Username = "root";
		String Password = "12345";
		int id = 103;
		String name = "Loy";
		String query = "insert into tab values (?, ?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");//completed
		Connection con = DriverManager.getConnection(url,Username,Password);
		PreparedStatement st = con.prepareStatement(query);//completed
		
		st.setInt(1, id);
		st.setString(2, query);
		
		int rs = st.executeUpdate();
		System.out.println(rs+"rows/s affected");
		
		
		st.close();
		con.close();
		
	}

}
