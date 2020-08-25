import java.io.*;
import java.sql.*;
import java.util.Scanner;

class V8a
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
	   String ssn, lname;
	   double salary;
           double meanSalary = 0.0;
           int numberOfEmployees = 0;
	   String stmt1 = "select Lname, Salary from EMPLOYEE";
           String stmt2 = "select count(lname) from employee";
	   PreparedStatement p = conn.prepareStatement(stmt1);
	   PreparedStatement p2 = conn.prepareStatement(stmt2);
           ResultSet r = p.executeQuery();
	   ResultSet q = p2.executeQuery();
           numberOfEmployees = q.getInt(1);
	   while( r.next() )
	   {
		lname = r.getString(1);
		salary = r.getDouble(2);
                meanSalary += salary;
	   }
           meanSalary /= numberOfEmployees;
	   System.out.println("Medallaun starfsmanna: " + meanSalary);
	   r.close();
	   conn.close();
    }
}
