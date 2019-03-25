/**
 * CarColor.java
 */

package ENSE470_Lab2;

/**
 * @author ShafiqZain
 *
 */

public class CarColor extends CarDecorator {

	public CarColor(Car newCar) {
		super(newCar);
		// TODO Auto-generated constructor stub
		
		System.out.println("Changing the Color Process; ");
		
		System.out.println("Blood Red is Chosen\n");
	}
	
	public String getDescription() {
		return tempCar.getDescription() + "Cool Car Color + ";
	}
	
	public double getCost() {
		return tempCar.getCost() + 250.00;
	}	
}
