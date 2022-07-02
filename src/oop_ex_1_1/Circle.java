package oop_ex_1_1;

/**
 * The Circle class models a circle with a radius and color.
 * https://www3.ntu.edu.sg/home/ehchua/programming/java/j3f_oopexercises.html#zz-1.1
 */
public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Circle() {  // 1st (default) constructor
      this.radius = 1.0;
      this.color = "red";
   }
   
   /** Constructs a Circle instance with the given radius and default color */
   public Circle(double radius) {  // 2nd constructor
      this.radius = radius;
      this.color = "red";
   }
   public Circle(double radius, String color) { //1.Modify the class Circle to include a third constructor for constructing a Circle instance with two arguments - a double for radius and a String for color.
	   this.radius = radius;
	   this.color = color;
   }
   
   /** Returns the radius */
   public double getRadius() {
     return radius; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }
// Getter for instance variable color
   public String getlColor() {
	   return color;
   }
   public void setColor (String newColor) {
	   this.color = newColor;
   }
   public void setRadiou(Double newRadius) {
	   this.radius = newRadius;
   }
   public String toString() {
	   return "Circle[radius=" + radius + " color=" + color + "]";
	}
   
}