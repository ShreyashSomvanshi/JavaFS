package pack.capg.module1.jdbc;

// 19-12-2024

import java.sql.*;
import java.util.Scanner;

public class TestConn2 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/capgJDBC";
		String user = "root";
		String pass = "Admin@1234";
		
		Scanner sc = new Scanner(System.in);
		
		
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("Driver loaded...");
			
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conn established ...");
			
			// CReate table
			String sql = "create table IF NOT EXISTS skill(courseId int primary key, courseName varchar(50), registrationDate Date , fee DECIMAL(10,2), Duration varchar(50))";
			
			Statement st = conn.createStatement();
			System.out.println("Created a statement object");
			st.executeUpdate(sql);
			System.out.println("Skill table created successfully...");

			System.out.println("Enter Course Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Course name: ");
			String name = sc.nextLine();
			
			sc.nextLine();
			
			System.out.println("Enter Registration date (YYYY-MM-DD): ");
			String date = sc.nextLine();
			
			sc.nextLine();
			
			System.out.println("Enter Course fee: ");
			double fee = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Enter course duration: ");
			String dur = sc.nextLine();
			
			String insertQuery = "insert into skill (courseId , courseName, registrationDate, fee, Duration) "+"values(?,?,?,?,?)";
			
			PreparedStatement ppdStmt = conn.prepareStatement(insertQuery);
			ppdStmt.setInt(1, id);
			ppdStmt.setString(2, name);
			ppdStmt.setDate(3, Date.valueOf(date));
			ppdStmt.setDouble(4, fee);
			ppdStmt.setString(5, dur);
			
			int row = ppdStmt.executeUpdate();
			if(row>0) {
				System.out.println("Data Inserted...");
			}else {
				System.out.println("Failed...");
			}
			
			ppdStmt.close();
			st.close();
			conn.close();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


/*
 
// Ma'am Code: 
 
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String url = "jdbc:mysql://localhost:3306/capgemini";
   String username = "root"; String password = "pass";
   
   Scanner sc = new Scanner( System.in);
   try {
	   Class.forName("com.mysql.cj.jdbc.Driver");
  	 System.out.println(" diver loaded");
  	 
  	 Connection con = DriverManager.getConnection(url, username,password);
  	 System.out.println("Establish the connection");
  	 
  	 //table creating 
  	 String sql = "create table IF NOT EXISTS skill (" 
  	 +"courseId int primary key,"
     + "courseName varchar(50),"
  	 +"registration_date Date,"
  	 +" fee DECIMAL(10,2),"
  	 +"Duration varchar(50))" ;
  	 
  	 Statement stm = con.createStatement();
  	 stm.executeUpdate(sql);
  	 System.out.println("Skill Table created successfully ");
  	 
  	 System.out.println(" Enter  course ID");
  	 int courseId = sc.nextInt();
  	 sc.nextLine();
  	 System.out.println("Enter course Name ");
  	 String courseName = sc.nextLine();
  	 System.out.println("\n Enter registration date (YYYY-MM-DD):");
  	 String registration_date = sc.nextLine();
  	 System.out.println("Enter Fee ");
  	 double fee = sc.nextDouble();
  	 sc.nextLine();
  	 System.out.println("Enter duration");
  	 String Duration = sc.nextLine();
  	 
  	 String insertSql = "INSERT INTO Skill (courseid, coursename, registration_date, fee, duration) "
  	 +"VALUES (?, ?, ?, ?, ?)";
  	 
  	PreparedStatement pstmt = con.prepareStatement(insertSql);
  	pstmt.setInt(1, courseId);
  	pstmt.setString(2, courseName);
    pstmt.setDate(3, Date.valueOf(registration_date));
    pstmt.setDouble(4, fee);
    pstmt.setString(5, Duration);
  	
  	int row = pstmt.executeUpdate();
  	if(row>0) {
  		System.out.println("Data inserted ");
  	}else {
  		System.out.println("failed ");
  	}
  	 pstmt.close();stm.close();con.close();sc.close();
  	 
   }catch (Exception e) {
	// TODO: handle exception
}
	}

}

 
 
 */
