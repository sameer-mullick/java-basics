abstract class Vehicle {
	public abstract String fuelType();
	public void move() {
		System.out.println(getClass().getSimpleName() + " is moving ");

	}

}

class Car extends Vehicle {
	@Override
	public String fuelType() {
		String fuelType = "Gas";
		return fuelType;
	}
}

class Bike extends Vehicle {
	@Override
	public String fuelType() {
		String fuelType = "Electric";
		return fuelType;
	}
}

class abstraction101 {
	public static void main (String [] arg) {
		Bike b = new Bike();
		Car c = new Car();
		System.out.println(b.fuelType());
        System.out.println(c.fuelType());

	}
}