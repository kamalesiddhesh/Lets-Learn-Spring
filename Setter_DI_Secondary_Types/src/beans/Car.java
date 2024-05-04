package beans;

public class Car {
	
	private Engine engine;
	private String carname;
	
	public Car() {
		System.out.println("Car Constructor..........");
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void printCarData() {
		System.out.println("Car Name: "+carname);
		System.out.println("Engine Model Year: "+engine.getModelyear());
	}
}
