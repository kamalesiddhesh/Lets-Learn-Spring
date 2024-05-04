package beans;

public class Car {
	 private String carnames;
	 private Engine engine;
	public String getCarnames() {
		return carnames;
	}
	public void setCarnames(String carnames) {
		this.carnames = carnames;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	 
	 
	 public void printData() {
		 System.out.println("Car : "+ carnames);
		 System.out.println("Model year: "+engine.getModelyear());
	 }
	 

}
