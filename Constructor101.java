class Car {
    private int wheels;
    private int doors;
    private int passengers;
    private String model;

    public Car(){
        wheels = 4;
        doors = 4;
        passengers = 5;
        model = "Toyota";
    }
    public void getDoor(){
        System.out.println("This car has " + doors + " doors");
    }
    public void getWheels(){
        System.out.println("This car has " + wheels + " wheels");
    }
    public void getPass(){
        System.out.println("This car has " + passengers + " passengers");
    }
    public void getModel(){
        System.out.println("This car is a " + model );
    }
}
class Constructor101 {
    public static void main(String[] args) {
        Car c = new Car();
        c.getDoor();
        c.getWheels();
        c.getPass();
        c.getModel();
    }
}