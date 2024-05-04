package beans;

public class Car {
	private String[] carnames;
	private Engine[] engines;
	
	public String[] getCarnames() {
		return carnames;
	}
	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}
	public Engine[] getEngines() {
		return engines;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	
	public void printCarNames() {
		for(String car: carnames) {
			System.out.println(car);
		}
		
		for(Engine e:engines) {
			System.out.println("Year: "+e.getModelyear());
		}
	}
	

}
