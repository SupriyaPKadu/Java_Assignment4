/*
1. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
  by creating a class named 'Triangle' with parameter in its constructor.
 */

package Assignment30_9_24;

public class TestTriangle {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(3, 4, 5);

		triangle.findArea();
		triangle.findPerimeter();
	}

}
