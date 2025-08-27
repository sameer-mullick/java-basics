import java.util.Arrays;
import java.util.Scanner;

class methods102 {

    static int add (int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me one number: ");
        int number1 = scan.nextInt();
        System.out.print("Give me one number: ");
        int number2 = scan.nextInt();

        System.out.print (number1 + " plus " + number2 + " equals " + add(number1,number2));

        int array[] = {1,3,10,6,100,8,2,4,12};
        System.out.print("\nOriginal Array: ");
        for(int i = 0;  i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        System.out.print("\nSorted Array: ");
        for(int i = 0;  i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        String car = "KHNSAUFBUQAFjfbwiwdmw";
        System.out.print("\nOriginal Stirng Array: " + car);
        
        char[]s_car = car.toCharArray();

        Arrays.sort(s_car);
        System.out.print("\nSorted String Array: ");
        for(int i = 0;  i < s_car.length; i++){
            System.out.print(s_car[i]);
        }


    }

}