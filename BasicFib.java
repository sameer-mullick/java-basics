import java.util.Scanner;

class c {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Enter a positive number (between 2 and 20): ");
            n = scan.nextInt();

            if (n >= 2 && n <= 20) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        int fib[] = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        System.out.println("First " + n + " terms of the Fibonacci sequence:");

        int count = 2;
        while (count < n) {
            fib[count] = fib[count - 2] + fib[count - 1];
            count++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }

        System.out.println("\n*** Finished! ***");
    }
}
