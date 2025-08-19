import java.util.Scanner;
class BasicFibwithMethod {
    static int[] Fib(int a){
        int array[] = new int[a];
        if (a > 0) array[0] = 0;
        if (a > 1) array[1] = 1;
        int count = 2;
        while (count < a){
            array[count] = array[count - 2] + array[count - 1];
            count++;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int num = scan.nextInt();
        System.out.println("First " + num + " terms of Fibonacci sequence are: ");
        int result [] = Fib(num);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("");
        System.out.print("*** End of generating Fibonacci Numbers ***");

    }
}