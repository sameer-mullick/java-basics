import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class easyIteration{
    public static void main (String[] arg){
        
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++){
            System.out.print("What number would you like to add: ");
            int a = scan.nextInt();
            list.add(a);
        }
        System.out.println(list);

        
        Iterator<Integer> itr = list.iterator();
        int b = 0;
        while (itr.hasNext()){
            b += itr.next();
        }
        
        System.out.println("The Sum is " + b);
        
        
    }
}