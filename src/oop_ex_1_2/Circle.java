package oop_ex_1_2;

public class Circle {
	private double radius = 1.0;
	
	//constructor 1
	public Circle(double radius){
		this.radius = radius;
	}
	
	//constructor 2 - default
	public Circle(){
	}
	
	//setter 1
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//getter 1
	public double getRadius() {
		return radius;
	}
	//getter 2
	public double getArea () {
	return area();
	}
	
	//getter 2
	public double getCircumference () {
		return circumference();
	}
	
	//method 1 area
	private double area() {
		double area = radius*radius*Math.PI;
		return area;
	}

	
	
	//method 1 circumference
	private double circumference() {
		double circumference = 2*radius*Math.PI;
		return circumference;
	}
	   public String toString() {
		   return "Circle[radius=" + radius + "]";
		}

}
