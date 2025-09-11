
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
            System.out.print(items[i] + " , ");
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
        System.out.print("\nAt the following store: " + this.storeName);
    }
}

class GroceryList{

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nHow many items would you like to add? : ");
    int num = scan.nextInt();
    while (num > 20){
        System.out.println("Too many items!!");
        System.out.print("\nHow many items would you like to add? : ");
        num = scan.nextInt();
    }
    scan.nextLine();
    System.out.print("\nWhats the store name: ");
    String w = scan.nextLine();
    Store s = new Store(w);
    for(int a = 1; a <= num; a++){
        System.out.print("\nItem " + a + ":");
        String i = scan.nextLine();
        s.insertItem(i);
    }
    System.out.println();
    s.printLists();
    
}
}