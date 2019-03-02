package ENSE470_Lab2;

public class CarWheels extends CarDecorator {

	public CarWheels(Car newCar) {
		super(newCar);
		// TODO Auto-generated constructor stub
		
		System.out.println("Adding new Type of Wheels; ");
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("Type-S Wheels is Chosen");
		}
	}
	
	public String getDescription() {
		return tempCar.getDescription() + "Cool 4 Car Wheels";
	}
	
	public double getCost() {
		return tempCar.getCost() + 1000.00;
	}	
}