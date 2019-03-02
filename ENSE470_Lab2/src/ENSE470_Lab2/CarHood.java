package ENSE470_Lab2;

public class CarHood extends CarDecorator {

	public CarHood(Car newCar) {
		super(newCar);
		// TODO Auto-generated constructor stub
		
		System.out.println("Adding a Hood Process; ");
		
		System.out.println("A Type-R Hood is Chosen\n");
	}
	
	public String getDescription() {
		return tempCar.getDescription() + "Cool Car Hood + ";
	}
	
	public double getCost() {
		return tempCar.getCost() + 500.00;
	}	
}