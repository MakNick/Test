
public class CarClassObject {

	public static void main(String[] args) {

		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();

		car1.fillData("Audi A6", 200 , "Blue", false);
		car2.fillData("Volkswagen Touareg", 180 , "Red", false);
		car3.fillData("Ford Fiesta", 150, "Black", false);
		car4.fillData("Tesla 100D", 270, "Silver", true);
		
		showSpecs(car1);
		showSpecs(car2);
		showSpecs(car3);
		showSpecs(car4);
	}
	
	static void showSpecs (Car newCar) {
		System.out.println("The brand and type of the car is: " + newCar.brand);
		System.out.println("The maximum speed is: " + newCar.maxSpeed);
		System.out.println("The color of the car is: " + newCar.color);
		if (newCar.electric == true) {
			System.out.println("This car makes no sound");
		} else {
			System.out.println("This car makes the sound: " + newCar.sound);
		}
		System.out.println();
	}

}

class Car {
	String brand;
	int maxSpeed;
	String color;
	Boolean electric;
	String sound = "Vroom!";
	
	void fillData (String a, int b, String c, boolean d) {
		brand = a;
		maxSpeed = b;
		color = c;
		electric = d;
	}
}
