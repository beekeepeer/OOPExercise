package oop_ex_1_1;

/**
 * 	
 *  A Test Driver for the Circle class
 */
public class TestCircle {  // Save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare an instance of Circle class called c1.
      // Construct the instance c1 by invoking the "default" constructor
      // which sets its radius and color to their default value.
	   
      Circle c1 = new Circle();
      c1.setRadiou(9.9);
      // Invoke public methods on instance c1, via dot operator.
      System.out.println("The circle c2 has radius of " + c1.getRadius() + " and area of " + c1.getArea() + " " + c1.getlColor());
      //The circle has radius of 1.0 and area of 3.141592653589793
      
      // Declare an instance of class circle called c2.
      // Construct the instance c2 by invoking the second constructor
      // with the given radius and default color.
      Circle c2 = new Circle(2.0);
      c2.setColor("gray");
      // Invoke public methods on instance c2, via dot operator.
      System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea() + " " + c2.getlColor());
      //The circle has radius of 2.0 and area of 12.566370614359172
      
      Circle c3 = new Circle(4.0, "blue");
      System.out.println("The circle c3 has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " " + c3.getlColor());
      
      Circle c4 = new Circle();
      c4.setColor("orange");
      c4.setRadiou(3.4);
      System.out.println("The circle c4 has radius of " + c4.getRadius() + " and area of " + c4.getArea() + " and color: " + c4.getlColor());
      System.out.println(c4);
   }
}	