/**
 * CarDecorator.java
 */

package ENSE470_Lab2;

/**
 * @author ShafiqZain
 *
 */

abstract class CarDecorator implements Car {
	
	protected Car tempCar;
	
	public CarDecorator(Car newCar) {
		
		tempCar = newCar;
	}
	
	public String getDescription() {
		return tempCar.getDescription();
	}
	
	public double getCost() {
		return tempCar.getCost();
	}
}
