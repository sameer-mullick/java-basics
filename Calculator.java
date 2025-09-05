class Demo {
  private double n1;
  private double n2;

  public Demo(double num1, double num2) {
    this.n1 = num1;
    this.n2 = num2;
  }

  double add() {
    return n1 + n2;

  }

  double subtract() {
    return n1 - n2;

  }

  double multiply() {
    return n1 * n2;

  }

  double divide() { 
    if (n1> n2){
      return n1/n2;
    }
    else {
      return n2/n1;
    }

  }
  
}

class Calculator {

  public static void main(String args[]) {
    Demo obj = new Demo(10, 94);

    System.out.println(obj.add());
    System.out.println(obj.subtract());
    System.out.println(obj.multiply());
    System.out.println(obj.divide());
  }

}