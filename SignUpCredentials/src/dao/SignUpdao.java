package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.SignupBean;

public class SignUpdao {

	public static int save(SignupBean bean) {
		int status=0;
		Connection con=DataBase.getconnection();
		String query="insert into signup (name,email,password,mobile)values (?,?,?,?)";
try {
	PreparedStatement ps=con.prepareStatement(query);
	
	ps.setString(1, bean.getName());
	ps.setString(2, bean.getEmail());
	ps.setInt(3, bean.getPassword());
	ps.setLong(4, bean.getMobile());
	status=ps.executeUpdate();
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		return status;
		
		
		
		
	}
	
	
	public static boolean verify(String email,int password) {
		
		boolean b=false;
		Connection con=DataBase.getconnection();
		ResultSet rs=null;
try {
	PreparedStatement ps=con.prepareStatement("select * from signup where email=? AND password=?");
ps.setString(1, email);
ps.setInt(2, password);

rs=ps.executeQuery();

while(rs.next()) {
b=true;
}

    


} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		return b;
		
		
	}
	
	
	
}
