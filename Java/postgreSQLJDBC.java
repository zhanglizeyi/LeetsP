import java.sql.Connection;
import java.sql.DriverManager;

public class postgreSQLJDBC{

	public static void main(String[] args){
		Connection conect = null;

		//request connect to db
		try{
		
			Class.forName("org.postgreSQLJDBC.Diver");
			conect = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/testdb","zhanglizeyi","123");

		}catch(Exception e){
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}
}