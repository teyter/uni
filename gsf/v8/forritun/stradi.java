String ssn;
        String stmt1 = "select Ssn from EMPLOYEE";
        PreparedStatement p = conn.prepareStatement(stmt1);

        p.clearParameters();
        ResultSet r = p.executeQuery();

        while (r.next()) {
            ssn = r.getString(1);
            String stmt2 = "UPDATE EMPLOYEE SET salary = salary + 100 WHERE Ssn = " + ssn;
            PreparedStatement s = conn.prepareStatement(stmt2);
            s.executeUpdate();
        }
        r.close();

        v8a.printTable(conn);

        conn.close();
