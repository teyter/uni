public class JavaDB {
    public static void main(String[] args) {

    stmt.executeUpdate("insert into MovieStar values ('brad pitt', 'M', '18-12-1963')");

    java.sql.Resultset rs = stmt.executeQuery("select length from Movie");

        int length = 0;
        int count = 0;
        double ans = 0.0;

        while () {
            length += rs.getint(1);
            count++
        }
        //rs.close()
        ans = length/count;
        Sys.print(ans);

    }
}
