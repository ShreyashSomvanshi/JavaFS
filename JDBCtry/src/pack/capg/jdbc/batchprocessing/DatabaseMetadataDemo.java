package pack.capg.jdbc.batchprocessing;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseMetadataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/capgjdbc";
		String user = "root"; String pass = "Admin@1234";
		    
	    try {
	    	Connection conn = DriverManager.getConnection(url, user, pass);
	    	
	    	DatabaseMetaData db = conn.getMetaData();
	    	
	    	System.out.println("database product name: " + db.getDatabaseProductName());
	    	System.out.println("Database product version: "+db.getDatabaseProductVersion());
	    	System.out.println("JDBC Driver name: "+db.getDriverName());
	    	System.out.println("JDBC driver version: "+db.getDriverVersion());
	    	System.out.println("database url: "+db.getURL());
	    	System.out.println("Database username: "+db.getUserName());
	    	
	    	System.out.println("Supports transaction?: "+db.supportsTransactions());
	    	
	    	String table[] = {"TABLE"};
	    	ResultSet tab = db.getTables("capgjdbc", null, null, table);
	    	
	    	System.out.println("\n Tables in the db: ");
	    	
	    	while(tab.next()) {
	    		String name = tab.getString("Table_name");
	    		System.out.println(" - "+name);
	    		
	    	}
	    	
	    	ResultSet col = db.getColumns(null, null, "skill", null);
	    	System.out.println("\n Columns in skill tables: ");
	    	while(col.next()) {
	    		String name = col.getString("column_name");
	    		String type = col.getString("type_name");
	    		System.out.println(" - "+name+" ("+type+") ");
	    		
	    	}
	    	
	    	tab.close(); col.close(); conn.close();
	    	
	    	
	    }catch(Exception e) {
	    	e.getMessage();
	    }
	}

}
