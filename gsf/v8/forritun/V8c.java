import java.io.*;
import java.sql.*;
import java.util.Scanner;

class V8c
{
    public static void main( String[] args )
	   throws Exception
    {
	   Connection conn;
	   try
	   {
		// Reynum fyrst PostgreSQL
		Class.forName("org.postgresql.Driver");	// fyrir PostgreSQL
		java.util.Properties props = new java.util.Properties();
		props.setProperty("user",args[0]);
		props.setProperty("password",args[1]);
		conn = DriverManager.getConnection("jdbc:postgresql:COMPANY",props);
	   }
	   catch( Exception e )
	   {
		// Höldum bara áfram og reynum SQLite
		try
		{
			Class.forName("org.sqlite.JDBC");		// fyrir SQLite
			conn = DriverManager.getConnection("jdbc:sqlite:company.db");
		}
		catch( Exception e2 )
		{
			// Höldum áfram og reynum ODBC
			conn = DriverManager.getConnection("jdbc:odbc:COMPANY");
		}
	   }

	   // Þegar hér er komið erum við með tengingu við gagnagrunn
	   // (conn) sem er annaðhvort PostgreSQL, SQLite eða ODBC.
	   String ssn;
	   String stmt1 = "select ssn from employee";
	   PreparedStatement p = conn.prepareStatement(stmt1);
	   p.clearParameters();
	   ResultSet r = p.executeQuery();

	   while( r.next() )
	   {
                ssn = r.getString(1);
                String stmt2 = "update employee set salary = salary+100 where ssn = "+ssn;;
	        PreparedStatement q = conn.prepareStatement(stmt2);
                q.executeUpdate();
	   }
	   r.close();
	   conn.close();
    }
}
