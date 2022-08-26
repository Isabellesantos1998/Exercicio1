package entities;

public class Rectangle {

	public double larg;
	public double alt;

	public double area() {
		return larg * alt;
	}

	public double perimetro() {
		return ((larg + alt) * 2);
	}

	public double diagonal() {
		double d;
		d = Math.sqrt(Math.pow(larg, 2) + Math.pow(alt, 2));
		return d;
	}

}
