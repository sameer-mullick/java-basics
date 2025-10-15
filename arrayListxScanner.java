import java.util.ArrayList;
import java.util.Scanner;

class arrayListxScanner{
    public static void main(String []arg){
        ArrayList <String> name = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many items are you inputting: ");
        int num = scan.nextInt();
        scan.nextLine();

        
        for (int i = 0; i < num; i++){
            System.out.print("Tell me word " + (i+1) + ": ");
            String store = scan.nextLine();
            name.add(store);
        }
        System.out.println(name);
    }
}
