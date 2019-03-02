package ENSE470_Lab2;

public class CarBumper extends CarDecorator {

	public CarBumper(Car newCar) {
		super(newCar);
		// TODO Auto-generated constructor stub
		
		System.out.println("Adding a Bumper Process;");
		
		System.out.println("Type-R Bumper is Chosen\n");
	}
	
	public String getDescription() {
		return tempCar.getDescription() + "Cool Car Bumper + ";
	}
	
	public double getCost() {
		return tempCar.getCost() + 500.00;
	}	
}