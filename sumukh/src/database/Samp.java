package database;

import java.sql.*;

public class Samp {
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
			
			System.out.println("Inserting records into the table...");
			String sql1= "INSERT INTO sumukhmg VALUES('dhanush','4VV20IS118' )";
			stmt.executeUpdate(sql1);
			sql1="INSERT INTO sumukhmg VALUES('dhanush','4VV20IS118')";
			stmt.executeUpdate(sql1);
			
			try {
				rs.close();
				stmt.close();
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}