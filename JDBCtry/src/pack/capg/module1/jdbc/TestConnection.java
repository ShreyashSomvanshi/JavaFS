package pack.capg.module1.jdbc;

// 19-12-2024

import java.sql.*;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("Driver loaded...");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/capg_try", "root", "Admin@1234");
			System.out.println("Conn established ...");
			
			Statement st = conn.createStatement();
			System.out.println("Create a statement object");
			
			ResultSet result = st.executeQuery("select * from users");
			while(result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				String email = result.getString("email");
				System.out.println("Id: "+id+" Name: "+name+" Email: "+email);
			}
			result.close();
			st.close();
			conn.close();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
