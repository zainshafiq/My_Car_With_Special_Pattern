package ENSE470_Lab2;

public class L02zainuddm {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Regina Car Dealer~ \n");
		
		Car myCar = new BasicCar();

		//Color
        myCar = new CarColor(myCar);
        
        //Hood
        myCar = new CarHood(myCar);
        
        //Exhaust
        myCar = new CarExhaust(myCar);
        
        //Bumper
        myCar = new CarBumper(myCar);

        //Wheels
        myCar = new CarWheels(myCar);
        
        System.out.println("\nNew Addition: " + myCar.getDescription());
        System.out.println("\nTotal Price: " + myCar.getCost());
        
        System.out.println("\nCongratulations for your new Car ~ \n");
	}
		
}