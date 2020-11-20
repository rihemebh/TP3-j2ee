package tp3_jee;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
private static Connection connection;
static {
try {
Class.forName("com.mysql.jdbc.Driver");
connection= DriverManager.getConnection ("jdbc:mysql://localhost:3306/DB_CAT","root","");
}
catch (Exception e) {
e.printStackTrace();
} 
}
public static Connection getConnection() {
	// TODO Auto-generated method stub
	return connection ;
}
}