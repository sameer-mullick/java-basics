import java.util.Random;
import java.util.Scanner;
class Vehicle {
    private String make;
    private String model;
    private int year;
    private int speed;
    
    public Vehicle(){
        this.make = "";
        this.model = "";
        this.year = 0;
        this.speed = 0;
    }
    public void setMake(String s){
        this.make = s; 
    }
    public String getMake(){
        return make;
    }
    
    public void setModel(String model){
        this.model = model; 
    }
    public String getModel(){
        return model;
    }
    public void setYear(int year){
        this.year = year; 
    }
    public int getYear(){
        return year;
    }
    
    public void setSpeed(int speed){
        this.speed = speed; 
    }
    public int getSpeed(){
        return speed;
    }
    public void start() {
        System.out.println("The vehicle has started");
    }
    
    public void stop() {
        speed = 0;
        System.out.println("The vehicle is started");
        
        
    }
    public void accelerate(int a) {
        speed += a;
        System.out.print("The vehicle is in motion and is " + speed + " miles per hour.");
        
    }   
    public void brake(int a) {
        speed -= a;
        System.out.print("The vehicle is redused and is " + speed + " miles per hour.");
    }
    public void printer(){
        start();
        System.out.println("This " + this.year + " " + this.make + " , is going  " + this.speed + "mph, and is the " + this.model + " model.");
    }
}

class Car extends Vehicle {
    private int numDoors;
    private String playMusic;
    
    public Car(){
        this.numDoors = 4;
        this.playMusic = "";
        
    }
    
    public void showNumDoors(){
        System.out.print("this car has " + numDoors + " doors");
    }
    
}

class carInheritance {
    public static void main (String[] arg){
        Random rand = new Random();
        Scanner scan = new Scanner (System.in);
        System.out.println("Whats your name? ");
        String name = scan.nextLine();
        Car carr = new Car();
        System.out.println("What make is your car? ");
        String a = scan.nextLine();
        carr.setMake(a);
        System.out.println("What model is your car? ");
        String b = scan.nextLine();
        carr.setModel(b);
        System.out.println("What year is your car? ");
        int c = scan.nextInt();
        carr.setYear(c);
        carr.setSpeed(rand.nextInt(55));
        carr.accelerate(4);
        carr.printer();
        
    }
}






