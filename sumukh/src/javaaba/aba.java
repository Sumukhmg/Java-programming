package javaaba;

import java.sql.*;

public class aba {
	public static void main(String[] args) throws Exception{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/javaaba","root","");
			System.out.println("XAMPP database connected....");
			  
			Statement stmt=con.createStatement();
			String data="SELECT* FROM studentdetails";
			ResultSet rs=stmt.executeQuery(data);
			while(rs.next()) {
				System.out.println(rs.getString("Name")+"\t"+rs.getString("USN")+"\t"+rs.getString("E-mail")+"\t");
				
			}
			
			
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
