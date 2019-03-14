package com.cg.BankingOperations.BankingOperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class SampleOracle{
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shruthi","root");
		PreparedStatement ps=con.prepareStatement("delete from books where book_id=107");
		int i=ps.executeUpdate();
		if(i!=0) {
			System.out.println("one row is affected");
		}
	}
}

















/*public class SampleOracle{
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shruthi","root");
		PreparedStatement ps=con.prepareStatement("insert into books values(?,?)");
		ps.setInt(1, 107);
		ps.setString(2,"famous five");
		int i=ps.executeUpdate();
		if(i!=0) {
			System.out.println("one row is affected");
		}
	}
}*/

















/*public class SampleOracle {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shruthi","root");
		PreparedStatement ps=con.prepareStatement("select * from books");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			System.out.println(id+" "+name);
		}
		rs.close();
		con.close();
	}
}*/
