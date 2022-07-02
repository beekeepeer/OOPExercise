package oop_ex_1_6;

public class Car {
	// Attributes associated with car
	int nomber;

	Car(int no) {
		this.nomber = no;
	}
	// Method 1
	// To swap
	public static void swap(Car car1, Car car2) {
		int temp = car1.nomber;
		car1.nomber = car2.nomber;
		car2.nomber = temp;
	}

	// Method 2
	// Main driver method
}

