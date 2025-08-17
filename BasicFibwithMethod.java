import java.util.Scanner;
class BasicFibwithMethod {
    static int[] Fib(int a){
        int arry[] = new int[a];
        if (a > 0) arry[0] = 0;
        if (a > 1) arry[1] = 1;
        int count = 2;
        while (count < a){
            arry[count] = arry[count - 2] + arry[count - 1];
            count++;
        }
        return arry;
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