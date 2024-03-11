package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class regDao {
  String url="jdbc:mysql://localhost:3306/raghini";
  String name="root";
  String pass= "abc123";
  
  private Connection getConnect() throws ClassNotFoundException, SQLException {
	  
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con =DriverManager.getConnection(url,name,pass);
	return con;
	
}
	public int Save(reg r) throws ClassNotFoundException, SQLException {
		
		String sql=("INSERT into jsp (fname,uname,email,pass) values(?,?,?,?)");
		PreparedStatement ps=getConnect().prepareStatement(sql);
		ps.setString(1, r.getFname());
		ps.setString(2, r.getUname());
		ps.setString(3, r.getEmail());
		ps.setString(4, r.getPass());
		return ps.executeUpdate();
		
	}
	public boolean checkUser(String uname ,String pass) throws SQLException, ClassNotFoundException
	{ String sql=("SELECT * from jsp WHERE uname=? and pass=?");
	Connection con =getConnect();
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, uname);
	ps.setString(2, pass);
	ResultSet rs=ps.executeQuery();
		return rs.absolute(1);
		
	}
  
}
