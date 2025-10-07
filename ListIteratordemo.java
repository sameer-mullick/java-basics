import java.util.*;

class ListIteratordemo{
    public static void main (String[] arg){
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Sameer");
        names.add("Shakira");
        names.add("Tania");
        names.add("Locant");
        names.add("Radah");
        
        ListIterator<String> idr = names.listIterator();
        System.out.println("Fowards:");
        System.out.println();
        while(idr.hasNext()){
            System.out.println(idr.next());
        }
        System.out.println();
        System.out.println("Backwords:");
        System.out.println();
        while(idr.hasPrevious()){
            System.out.println(idr.previous());
        }
        idr.next();
        idr.next();
        idr.add("Johnny");
        System.out.println();
        System.out.println("Updated list:");
        System.out.println();
        System.out.println(names); 
        
    }
}