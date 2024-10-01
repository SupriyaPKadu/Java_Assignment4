/*
 Write a class Time with three data members to store hr, min and seconds. Create two constructors and apply 
 checks to set valid time. (hr<24, min<60, sec<60). Also create display function which displays all data members.
 */

package Assignment30_9_24;

public class TestTime {

	public static void main(String[] args) {
		Time time1 = new Time(12, 30, 45);
        time1.display();  // Displays: Time: 12:30:45

        Time time2 = new Time(25, 61, 70);  // Invalid input
        time2.display();  // Should display warnings and default to 00:00:00

        Time time3 = new Time();  // Default constructor
        time3.display();  // Displays: Time: 00:00:00
	}

}
