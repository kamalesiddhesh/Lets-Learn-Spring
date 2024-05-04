package beans;

import java.util.*;

import org.springframework.beans.factory.annotation.*;

public class Test {
	@Value("${driver}")
	private String driverName;
	
	@Value("${url}")
	private String url;
	
	@Value("${user}")
	private String user;
	
	@Value("${password}")
	private String password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public void printData() {
		System.out.println("DriverName : "+driverName);
		System.out.println("URL : "+url);
		System.out.println("User : "+user);
		
		System.out.println("Password : "+password);
	}		
}
