package database;

import java.sql.*;
public class Demodatabase {
	public static void main(String[] args) throws Exception{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/workshop","root","");
			System.out.println("XAMPP database connected....");
			
			Statement stmt=con.createStatement();
			String data="SELECT* FROM sumukhmg";
			ResultSet rs=stmt.executeQuery(data);
			while(rs.next()) {
				System.out.println(rs.getString("name")+"\t"+rs.getString("usn"));
				
			}
			try {
				rs.close();
				stmt.close();
				
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}