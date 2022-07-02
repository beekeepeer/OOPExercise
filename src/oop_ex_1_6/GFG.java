package oop_ex_1_6;


//Class 2
//Uses Car objects
class GFG {

	public static void main(String[] args) {
		// Creating car class objects(creating cars)
		Car c1 = new Car(1);
		Car c2 = new Car(2);

		// Calling method 1
		Car.swap(c1, c2);

		// Print and display commands
		System.out.println("c1.no = " + c1.nomber);
		System.out.println("c2.no = " + c2.nomber);
	}

}
