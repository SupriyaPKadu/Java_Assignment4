/*
  Write a program by creating an 'Employee' class having the following methods and print the final salary.
a.    'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
b.    'AddSal()' which adds $10 to salary of the employee if it is less than $500.
c.    'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
 */

package Assignment30_9_24;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		employee.getInfo();
		employee.AddSal();
		employee.AddWork();
		employee.finalSalary();

	}

}
