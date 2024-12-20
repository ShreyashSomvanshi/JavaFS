package pack.capg.jdbc.batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchProcessingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   String url = "jdbc:mysql://localhost:3306/capgjdbc";
	   String username = "root"; String password = "Admin@1234";
	   
	   // insert query
	   String sql = "insert isnto student(id, name, age) values (?,?,?)";
	   
	   // update age
//	   String sql = "update student set age = 20 where age>13";
	   
	   Connection con = null;
	   try {
		   con= DriverManager.getConnection(url, username,password);
		   System.out.println("Connection established ...");
		   con.setAutoCommit(false);
		   
		   PreparedStatement ppdStmt = con.prepareStatement(sql);
		   
		   ppdStmt.setInt(1, 1); ppdStmt.setString(2, "John"); ppdStmt.setInt(3, 12); ppdStmt.addBatch();
		   ppdStmt.setInt(1, 2); ppdStmt.setString(2, "Sheena"); ppdStmt.setInt(3, 13); ppdStmt.addBatch();
		   ppdStmt.setInt(1, 3); ppdStmt.setString(2, "Rose"); ppdStmt.setInt(3, 12); ppdStmt.addBatch();
		   ppdStmt.setInt(1, 4); ppdStmt.setString(2, "Mac"); ppdStmt.setInt(3, 11); ppdStmt.addBatch();
		   ppdStmt.setInt(1, 5); ppdStmt.setString(2, "Sam"); ppdStmt.setInt(3, 10); ppdStmt.addBatch();
		   ppdStmt.setInt(1, 6); ppdStmt.setString(2, "Julie"); ppdStmt.setInt(3, 14); ppdStmt.addBatch();
		   ppdStmt.setInt(1, 7); ppdStmt.setString(2, "David"); ppdStmt.setInt(3, 12); ppdStmt.addBatch();
		   
		   int[] updateCounts = ppdStmt.executeBatch();
		   System.out.println("Batch execution completed. Rows affected: ");
		   for(int count : updateCounts) {
			   System.out.println(count);
		   }
		   con.commit();
		   System.out.println("transaction committed");
		   ppdStmt.close();
		   con.close();
		   
		  }catch(Exception e) {
		   System.out.println(e);
		   
		   if(con != null ) {
			  try {
				  System.out.println("Rolling back ");
				  con.rollback();
			  }catch (Exception r) {
				// TODO: handle exception
				  r.printStackTrace();
			  }
		   }
	   }
	}

}
