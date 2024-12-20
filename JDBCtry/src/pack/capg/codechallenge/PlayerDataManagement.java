package pack.capg.codechallenge;

import java.sql.*;
import java.util.Scanner;

class DataOps implements DataOperations{
	
	String url = "jdbc:mysql://localhost:3306/playersdata";
	String user = "root"; String pass = "Admin@1234";
	
	@Override
	public void addPlayer() {
		// TODO Auto-generated method stub
		// int id, String name, String skill, int exp, String country, double overall_score
		Connection con;
		try {
			con = DriverManager.getConnection(url, user,pass);
			con.setAutoCommit(false);
			String addPlayer = "insert into players(id, pname, skill, exp, country, overall_score) values(?,?,?,?,?,?)";
			
			Scanner sc = new Scanner(System.in);
			try(PreparedStatement addP = con.prepareStatement(addPlayer)){
				System.out.println("ADD PLAYERS: ");
				System.out.println("\nEnter Player Id: ");
				int id = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Player Name: ");
				String pname = sc.nextLine();
				
				sc.nextLine();
				System.out.println("Enter Player Skill(Batter/Bowler): ");
				String skill = sc.nextLine();
				
				System.out.println("Enter Player Experience in years: ");
				int exp = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Player Country: ");
				String country = sc.nextLine();
				
				System.out.println("Enter Player Overall Score out of 100: ");
				double overall_score = sc.nextDouble();
				
				
				   addP.setInt(1, id); // id
				   addP.setString(2, pname); // pname
				   addP.setString(3, skill); // skill
				   addP.setInt(4, exp); // exp
				   addP.setString(5, country); // country
				   addP.setDouble(6, overall_score); // overallscore
//				   addP.executeUpdate();
				   
				   int row = addP.executeUpdate();
					if(row>0) {
						con.commit();
						System.out.println("Data Inserted...");
					}else {
						con.rollback();
						System.out.println("Failed...");
					}
				sc.close();
				addP.close();
				con.close();
				
				   
			 }catch(Exception e) {
				   System.out.println("FAiled to add player..");
				   e.printStackTrace();
			 }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updatePlayer() {
		// TODO Auto-generated method stub
		Connection con;
		try {
			con = DriverManager.getConnection(url, user,pass);
			con.setAutoCommit(false);
			String updatePlayer = "update players set pname=?, skill=?, exp=?, country=?, overall_score=? where id=?";
			
			Scanner sc = new Scanner(System.in);
			try(PreparedStatement updP = con.prepareStatement(updatePlayer)){
				System.out.println("UPDATE PLAYER DETAILS: ");
				System.out.println("\nEnter Player Id to update details: ");
				int id = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Player Name: ");
				String pname = sc.nextLine();
				
				sc.nextLine();
				System.out.println("Enter Player Skill(Batter/Bowler): ");
				String skill = sc.nextLine();
				
				System.out.println("Enter Player Experience in years: ");
				int exp = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Player Country: ");
				String country = sc.nextLine();
				
				System.out.println("Enter Player Overall Score out of 100: ");
				double overall_score = sc.nextDouble();
				
				
				   updP.setInt(6, id); // id
				   updP.setString(1, pname); // pname
				   updP.setString(2, skill); // skill
				   updP.setInt(3, exp); // exp
				   updP.setString(4, country); // country
				   updP.setDouble(5, overall_score); // overallscore
//				   addP.executeUpdate();
				   
				   int row = updP.executeUpdate();
					if(row>0) {
						con.commit();
						System.out.println("Data Updated...");
					}else {
						con.rollback();
						System.out.println("Failed to update details...");
					}
				sc.close();
				updP.close();
				con.close();
				
				   
			 }catch(Exception e) {
				   System.out.println("FAiled to Update player..");
				   e.printStackTrace();
			 }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		try {
			
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			Statement st = conn.createStatement();
			System.out.println("All Players Data: ");
			ResultSet result = st.executeQuery("select * from players");
			while(result.next()) {
				int id = result.getInt("id");
				String name = result.getString("pname");
				String skill = result.getString("skill");
				int exp = result.getInt("exp");
				String country = result.getString("country");
				double score = result.getDouble("overall_score");
				
				System.out.println("Id: "+id+", Player Name: "+name+", Skill: "+skill+", Experience: "+exp+" years, Country: "+country+", Overall Score: "+score);
			}
			result.close();
			st.close();
			conn.close();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletePlayer() {
		// TODO Auto-generated method stub
		Connection con;
		try {
			con = DriverManager.getConnection(url, user,pass);
			con.setAutoCommit(false);
			String delPlayer = "delete from players where id = ?";
			
			Scanner sc = new Scanner(System.in);
			try(PreparedStatement delP = con.prepareStatement(delPlayer)){
				System.out.println("DELETE PLAYER: ");
				System.out.println("\nEnter Player Id to delete: ");
				int pid = sc.nextInt();
				
				delP.setInt(1, pid); // id
				
				int row = delP.executeUpdate();
				if(row>0) {
					con.commit();
					System.out.println("Player Deleted...");
				}else {
					con.rollback();
					System.out.println("Failed to delete player...");
				}
				sc.close();
				delP.close();
				con.close();
				
				   
			 }catch(Exception e) {
				   System.out.println("FAiled to delete player..");
				   e.printStackTrace();
			 }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listbycountry() {
		
		try {
			
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			Statement st = conn.createStatement();
			System.out.println("Players by Country: ");
			ResultSet result = st.executeQuery("select * from players where LOWER(country) = LOWER(?)");
			while(result.next()) {
				int id = result.getInt("id");
				String name = result.getString("pname");
				
				String country = result.getString("country");
				
				
				System.out.println("Id: "+id+", Player Name: "+name+", Country: "+country);
			}
			result.close();
			st.close();
			conn.close();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void listbyexp() {
		
		try {
			
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			Statement st = conn.createStatement();
			System.out.println("Players Data Sorted by Experience: ");
			ResultSet result = st.executeQuery("select * from players ORDER BY exp DESC");
			while(result.next()) {
				int id = result.getInt("id");
				String name = result.getString("pname");
				int exp = result.getInt("exp");
				
				System.out.println("Id: "+id+", Player Name: "+name+", Experience: "+exp+" years");
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



public class PlayerDataManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Player Data Management");
		Scanner sc = new Scanner(System.in);
		
		DataOps dop = new DataOps();
		System.out.println("1. Add Player");
		System.out.println("2. Update Player");
		System.out.println("3. Delete Player");
		System.out.println("4. Display All Players");
		System.out.println("5. List Players by Country");
		System.out.println("6. List Players by Experience");
		System.out.println("\nEnter your choice: ");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			dop.addPlayer();
			break;
		case 2:
			dop.updatePlayer();
			break;
		case 3:
			dop.deletePlayer();
			break;
		case 4:
			dop.displayAll();
			break;
		case 5:
			dop.listbycountry();
			break;
		case 6:
			dop.listbyexp();
			break;
		default:
			System.out.println("Invalid Request");
		}

	}

}
