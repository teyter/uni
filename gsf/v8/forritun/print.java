    public static void print(Connection conn) {
	   String ssn, lname;
	   double salary;
           try {

               String stmt0 = "select fname, minit, lname, salary from ssn = 88866555";
               PreparedStatement p = conn.prepareStatement(stmt0);
               ResultSet r = p.executeQuery();
               while( r.next() )
               {
                    lname = r.getString(1);
                    salary = r.getDouble(2);
                    System.out.println(lname+" "+salary);
               }
           } catch (Exception e) {
                System.out.println(e);
           }
    }
