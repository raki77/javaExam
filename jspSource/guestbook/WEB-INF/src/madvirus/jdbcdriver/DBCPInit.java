package madvirus.jdbcdriver;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.util.StringTokenizer;

public class DBCPInit extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        try {
            String drivers = config.getInitParameter("jdbcdriver");
            StringTokenizer st = new StringTokenizer(drivers, ",");
            while (st.hasMoreTokens()) {
                String jdbcDriver = st.nextToken();
                Class.forName(jdbcDriver);
            }
            
            Class.forName("org.apache.commons.dbcp.PoolingDriver");
            
            //System.setProperty("org.xml.sax.driver",
            //       "org.apache.crimson.parser.XMLReaderImpl");
        } catch(Exception ex) {
            throw new ServletException(ex);
        }
    }
}