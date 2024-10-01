/*
Write a program that has variables to store Car data like; CarModel, CarName, CarPrice and CarOwner. The program should 
include functions to assign user defined values to the above mentioned variable and a display function to show the values.
Write a main that calls these functions. Now write another runner class that declares three Car objects and displays the
 data of all three.
 */

package Assignment30_9_24;

public class TestCar {

	public static void main(String[] args) {
		 Car car1 = new Car();
	        Car car2 = new Car();
	        Car car3 = new Car();

	        // Assign values for each car
	        System.out.println("Enter details for Car 1:");
	        car1.accept();
	        
	        System.out.println("Enter details for Car 2:");
	        car2.accept();
	        
	        System.out.println("Enter details for Car 3:");
	        car3.accept();

	        // Display the car data
	        System.out.println("Details of Car 1:");
	        car1.display();
	        System.out.println("==================================");
	        
	        System.out.println("Details of Car 2:");
	        car2.display();
	        System.out.println("==================================");
	        
	        System.out.println("Details of Car 3:");
	        car3.display();
	    }
	}
