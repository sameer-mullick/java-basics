
import java.util.Scanner;
class Grocery {
    private int numberItems;
    private String items[];

    public Grocery(){
        numberItems = 0;
        items = new String[20];
    }
    public void insertItem(String a){
        items[numberItems] = a; 
        numberItems++;
    }

    public void printList(){
        System.out.println("These are the items in your list: ");
        for(int i =0; i < numberItems; i ++){
            System.out.print(items[i] + ",");
        }
    }
}
class Store extends Grocery {
    private String storeName;
    
    public Store(String b){
        this.storeName = b;
    }
    public void printLists (){
        printList();
        System.out.println("At the following store: " + storeName);
    }
}

class GroceryList{

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many items would you like to add? : ");
    int num = scan.nextInt();
    for(int a = 1; a <= num; a++){
        System.out.println("Item " + a + ":");
    }
}
}