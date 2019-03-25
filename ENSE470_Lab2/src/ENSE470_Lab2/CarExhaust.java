/**
 * CarExhaust.java
 */

package ENSE470_Lab2;

/**
 * @author ShafiqZain
 *
 */

public class CarExhaust extends CarDecorator {

	public CarExhaust(Car newCar) {
		super(newCar);
		// TODO Auto-generated constructor stub
		
		System.out.println("Adding an Exhaust Process;");
		
		System.out.println("Type-S Exhaust is Chosen\n");
	}
	
	public String getDescription() {
		return tempCar.getDescription() + "Cool Car Exhaust + ";
	}
	
	public double getCost() {
		return tempCar.getCost() + 450.00;
	}	
}
