package oop_ex_1_3;

public class Rectangle {
	private float length = 1;
	private float width = 1;
	private float area;
	private float perimeter;
	private static int count = 0;

//	 constructor 1
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

//	constructor 2 default
	public Rectangle() {
	}

//	method 1
	public void setLength(float length) {
		this.length = length;
	}

//	 method 2
	public void setWidth(float width) {
		this.width = width;
	}

//	 method 3
	public float getLength() {
		return length;
	}

//	 method 4
	public float getWidth() {
		return width;
	}

//	 method 5
	public float getArea() {
		area = length * width;
		return area;
	}

//	 method 6
	public float getPerimeter() {
		perimeter = (length + width) * 2;
		return perimeter;
	}

	@Override
	public String toString() {
		count++;
		return "r" + count + ". length = " + length + ", Width = " + width;
	}
}
