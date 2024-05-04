package beans;

import java.sql.*;

import org.springframework.beans.factory.annotation.Required;

public class Test {

	private String driver;
	private String url;
	private String user;
	private String password;
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	
	@SuppressWarnings("deprecation")
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	
	@SuppressWarnings("deprecation")
	@Required
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	
	@SuppressWarnings("deprecation")
	@Required
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void printConnection() throws Exception{
//		Class.forName("driver");
		Connection con = DriverManager.getConnection(url);
		System.out.println(con.toString());
	}
	
	

}
