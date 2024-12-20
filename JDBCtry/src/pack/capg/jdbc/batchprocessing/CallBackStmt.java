package pack.capg.jdbc.batchprocessing;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallBackStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/capgjdbc";
		String user = "root"; String pass = "Admin@1234";
		   
	    // insert query
	    String sql = "{call getStudentInfo(?,?,?)}";
		  
	    try {
	    	Connection conn = DriverManager.getConnection(url, user, pass);
	    	CallableStatement stmt = conn.prepareCall(sql);
	    	
	    	stmt.setInt(1, 4);
	    	
	    	stmt.registerOutParameter(2, Types.VARCHAR);
	    	stmt.registerOutParameter(3, Types.INTEGER);
	    	
	    	stmt.execute();
	    	
	    	String stuName = stmt.getString(2);
	    	int stuAge = stmt.getInt(3);
	    	
	    	System.out.println("Student Name: " + stuName + ", " + "Age: "+stuAge);
	    	
	    }catch(Exception e) {
	    	e.getStackTrace();
	    }
	}

}
