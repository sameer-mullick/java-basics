import java.util.ArrayList;
import java.util.List;

class dsaArrayListPractice{
    public static void main (String [] arg){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(10);
        
        System.out.println(list);
        System.out.println("The element is index one is " + list.get(1));
        System.out.println("The size of the list is " + list.size());
    }
}