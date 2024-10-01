package Assignment30_9_24;

public class Complex {

	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex add(Complex other) {
		return new Complex(real + other.real, imaginary + other.imaginary);
	}

	public Complex subtract(Complex other) {
		return new Complex(real - other.real, imaginary - other.imaginary);
	}

	public Complex multiply(Complex other) {
		double realPart = real * other.real - imaginary * other.imaginary;
		double imaginaryPart = real * other.imaginary + imaginary * other.real;
		return new Complex(realPart, imaginaryPart);
	}

	@Override
	public String toString() {
		return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
	}
}
