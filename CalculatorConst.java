import java.util.Scanner;
class Rectangle {

  private int length;
  private int width;
  
  
  
  public Rectangle() {
   this.length = 0;
   this.width = 0;
    
    
  }
  
  public Rectangle(int length, int width) {

    this.length = length;
    this.width = width;

  }

  public int getArea() {
    int area = length*width;
    
    return area; 
  }
  
}

class CalculatorConst{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("We will find the area of a rectangle! ");
        System.out.print("\n Length : ");
        int a = scan.nextInt();
        System.out.print("\n Width : ");
        int b = scan.nextInt();
        Rectangle rec = new Rectangle(a,b);
        System.out.print("\n Area is: " + rec.getArea());
    }
}