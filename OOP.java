abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    
    public Vehicle(String make, String model, int year ){
        this.make = make;
        this.model = model;
        this.year = year;
    } 
    
    public abstract String fuelType();
    
    public void printDetails(){
        System.out.print(this.make + ", " + this.model + ", " + this.year);
    }
}

interface Insurable {
    void getInsuranceQuote();
}

class Car extends Vehicle implements Insurable{
    private int numDoors;
    
    public Car(String make, String model, int year, int numDoors){
        super (make,model,year );
        this.numDoors = numDoors;
    }
    
    @Override
    public String fuelType(){
        return "Gas";
    }
    
    @Override
    public void getInsuranceQuote(){
        System.out.print("Car insurance quoted calculated");
    }
}
class ElectricScooter extends Vehicle{
    private int batteryLife;
    
    public ElectricScooter(String make, String model, int year, int batteryLife){
        super (make,model,year );
        this.batteryLife = batteryLife;
    }
    
    @Override
    public String fuelType(){
        return "Electic";
    }
    
}

class Truck extends Vehicle implements Insurable{
    private int loadCapacity;
    
    public Truck(String make, String model, int year, int loadCapacity){
        super (make,model,year );
        this.loadCapacity = loadCapacity;
    }
    
    @Override
    public String fuelType(){
        return "Diesel";
    }
    
    @Override
    public void getInsuranceQuote(){
        System.out.print("Truck insurance quoted calculated");
    }
}

class OOP{
    public static void main (String [] arg){
        Vehicle[]vehicle = {new Car(), new ElectricScooter(), new Truck()};
        
        for (int i = 0; i< vehicle.length ; i++){
            vehicle[i].printDetails();
        }
        
    }
}

