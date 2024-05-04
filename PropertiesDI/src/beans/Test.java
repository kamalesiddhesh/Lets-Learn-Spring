package beans;

import java.util.Properties;
import java.util.Set;

public class Test {
	private Properties drivers;

	public Properties getDrivers() {
		return drivers;
	}

	public void setDrivers(Properties drivers) {
		this.drivers = drivers;
	}
	
	public void printData() {
		Set keys= drivers.keySet();
		for(Object key:keys) {
			System.out.println(key+" : "+drivers.getProperty(key.toString()));
		}
	}
}
