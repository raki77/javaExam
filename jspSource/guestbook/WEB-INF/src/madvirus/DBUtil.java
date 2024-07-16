package madvirus;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;


public class DBUtil {
    public static Connection getConnection(String poolName)
    throws SQLException {
        	//return DriverManager.getConnection(
        	Connection conn = null;

        	try {
         		Context initContext = new InitialContext();
				Context envContext  = (Context)initContext.lookup("java:/comp/env");
				DataSource ds = (DataSource)envContext.lookup("jdbc/guestbook");
				conn = ds.getConnection();
			} catch (NamingException ex) {
				ex.printStackTrace();
			}

			return conn;

        	//"jdbc:apache:commons:dbcp:jdbc/guestbook");

            //"jdbc:apache:commons:dbcp:/"+poolName);
            /*
            Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/guestbook");
			Connection conn = ds.getConnection();
			return conn;
			*/

    }
}