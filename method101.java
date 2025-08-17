
import java.util.Scanner;
class method101 {
    static void multi(int a){
        for (int i = 1; i <= 30; i++){
            System.out.println(a + " x " + i + " = " + a*i);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int num = scan.nextInt();
        multi(num);
        
    }
}