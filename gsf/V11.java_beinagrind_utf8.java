import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

// Notkun: java -cp .;sqlite-jdbc-....jar V11 <args>
//         þar sem <args> er: [autocommit|noautocommit] [index|noindex]
// Eftir:  Búið er að mæla tíma fyrir gagnagrunnsaðgerðir og
//         skrifa niðurstöður
public class V11
{
    public static void main( String[] args )
        throws Exception
    {
        Class.forName("org.sqlite.JDBC");
        boolean USE_AUTOCOMMIT = args[0].equals("autocommit");
        boolean USE_INDEX = args[1].equals("index");
    
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection("jdbc:sqlite:v11.db");
            conn.setAutoCommit(USE_AUTOCOMMIT);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DROP TABLE IF EXISTS R");
            stmt.executeUpdate("DROP INDEX IF EXISTS RINDEX");
            stmt.executeUpdate("CREATE TABLE R(key INTEGER PRIMARY KEY, value DOUBLE)");

            if (USE_INDEX) {
                stmt.executeUpdate("CREATE INDEX RINDEX ON R(value)");
            }

            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO R VALUES(?,?)");

            long start,end;

            start = System.nanoTime();
            int i;
            for( i=0 ; i!=1000000 ; i++ )
            {
                pstmt.setInt(1, i);
                pstmt.setDouble(2, Math.random());
                pstmt.executeUpdate();
                if (System.nanoTime()-start > 6e10) break;
            }
            if( !USE_AUTOCOMMIT ) conn.commit();

            end = System.nanoTime();
            System.out.println("Tími fyrir "+
                               i+" innsetningar: "+
                               (double)(end-start)/1e9
                              );

            System.out.println("Tími per innsetningu: "+
                               (double)(end-start)/1e9/i
                              );

            start = System.nanoTime();
            ResultSet r =
                stmt.executeQuery
                    ("SELECT COUNT(*) FROM R WHERE "+
                     "value BETWEEN 0.01 AND 0.10"
                    );
            r.next();
            System.out.println("Niðurstaða leitar: "+r.getInt(1));
            System.out.println("Tími fyrir leit: "+
                               (double)(System.nanoTime()-start)/1e9
                              );
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(conn != null)
                  conn.close();
            }
            catch(SQLException e)
            {
                System.err.println(e);
            }
        }
    }
}
