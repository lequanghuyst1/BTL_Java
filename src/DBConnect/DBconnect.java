package DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getConnection();
	}
	public static Connection getConnection() {
   	 String DB_URL = "jdbc:sqlserver://DESKTOP-GO0NVIF\\SQLEXPRESS01:1433;"+ "databaseName=QLSinhVien;"
	            + "integratedSecurityx=true";
	     String USER_NAME = "sa";
	    String PASSWORD = "123456789";
       Connection conn = null;
       try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
           System.out.println("connect successfully!");
       } catch (Exception ex) {
           System.out.println("connect failure!");
           ex.printStackTrace();
       }
       return conn;
   }
}
