import java.util.Scanner;
class Demo {
  private double n1;
  private double n2;

  public Demo(double num1, double num2) {
    this.n1 = num1;
    this.n2 = num2;
  }

  void add() {
    System.out.println(n1 + " + " + n2 + " = " +( n1 + n2 ));

  }

  void subtract() {
    System.out.println(n1 + " - " + n2 + " = " +( n1 - n2 ));

  }

  void  multiply() {
    System.out.println(n1 + " * " + n2 + " = " +( n1 * n2 ));

  }

  void  divide() { 
    if (n1> n2){
      System.out.println(n1 + " / " + n2 + " = " +( n1 / n2 ));;
    }
    else {
      System.out.println(n1 + " / " + n2 + " = " +( n2 / n1 ));;
    }

  }
  
}

class Calculator {

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give us two numbers");
    System.out.print("(bigger) Number 1 : ");
    double a = scan.nextDouble();
    System.out.print("(smaller) Number 2: ");
    double b = scan.nextDouble();
    Demo obj = new Demo(a, b);

    obj.add();
    obj.subtract();
    obj.multiply();
    obj.divide();
  }

}