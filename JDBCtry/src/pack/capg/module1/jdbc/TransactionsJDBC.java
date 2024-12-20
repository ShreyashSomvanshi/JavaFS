package pack.capg.module1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 
Begin transaction; //start transaction implicitly and you can control it manually by setAutoCommit(false);
 commit - all the transaction execte successfully can commit all of them to make changes permanent
 rollback - if any statement fails, it can rollback to undo all the changes
 
 
 steps:
 1. disable auto comit
 2. execute sql statements like insert, update, delete
 3. if no error then commmit the transaction using conn.commit
 4. if any error occur rollback the transaction using conn.rollback to ensure the database remain consistent

*/


import java.sql.*;

 public class TransactionsJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/capgjdbc";
		   String username = "root"; String password = "Admin@1234";
		   Connection con = null;
		   try {
			   con= DriverManager.getConnection(url, username,password);
			   //step -1 Disable auto-commit mode to manage the transaction manually
			   con.setAutoCommit(false);
			   //step-2 
			   String debit = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
			   String credit = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";
			   try(PreparedStatement debStmt = con.prepareStatement(debit)){
				   debStmt.setDouble(1, 100); // amount
				   debStmt.setInt(2, 101); // id
				   int row = debStmt.executeUpdate();
				   if(row > 0) {
					  // throw new SQLException("Debit operation not working ");
					   System.out.println("Debited ");
				        }
			   }
				   try(PreparedStatement crStmt = con.prepareStatement(credit)){
					   crStmt.setDouble(1,800); // 1- amount
					   crStmt.setInt(2,101); // 2- id
					   int row1 = crStmt.executeUpdate();
					   if(row1 > 0) {
						  // throw new SQLException("crebit operation not working ");
						   System.out.println("Credited");
					   }
			   }
				   //Step 4: If both operations are successful, commit the transaction
			   con.commit();
			   
			   System.out.println("Transaction completed successfully!");
			   }catch (Exception e) {
			// TODO: handle exception
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
		   
		   







/* 
// My code: auto terminating

public class TransactionsJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc://mysql://localhost:3306/capgjdbc";
		String user = "root";
		String pass = "Admin@1234";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection established ..");
			//step 1 - disable auto commit
			con.setAutoCommit(false);
			
			//step2
			String debit = "UPDATE accounts SET balance= balance - ? where account_id = ?";
			String credit = "UPDATE accounts SET balance= balance + ? where account_id = ?";
			
			try(PreparedStatement debStmt = con.prepareStatement(debit)){
				debStmt.setDouble(1, 1000);
				debStmt.setInt(2,  101);
				int row = debStmt.executeUpdate();
				if(row > 0) {
					System.out.println("Debited");
				}
				debStmt.close();
			}
			
			try(PreparedStatement credStmt = con.prepareStatement(credit)){
				credStmt.setDouble(1, 500);
				credStmt.setInt(2,  101);
				int row1 = credStmt.executeUpdate();
				if(row1 == 0) {
					System.out.println("Credited");
				}
				credStmt.close();
			}
		
			
			con.commit();
			System.out.println("Transactions completed successfully...");
			con.close();
			
		}catch(Exception e) {
			if(con != null) {
				try {
					System.out.println("Rolling back");
					con.rollback();
				}catch(Exception e2) {
					System.out.println("2nd catch");
					e2.printStackTrace();
				}
			}
		}
	}

}

*/

 
 