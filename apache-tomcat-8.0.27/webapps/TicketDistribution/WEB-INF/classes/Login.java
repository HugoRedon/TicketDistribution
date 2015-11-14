import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
public class Login extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		try{
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/TicketDistribution");
			Connection conn = ds.getConnection();
			System.out.println("connection opened successfully");
		}catch(Exception ex){
			System.out.println("Exception: " + ex.getMessage());
		}
		
	}
	
}