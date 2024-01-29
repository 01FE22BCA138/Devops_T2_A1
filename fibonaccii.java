import java.util.Scanner;

public class fibonaccii {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter ur range");
        int n = s.nextInt();
        System.out.println("Fibonacci Series up to " + n + ":");
        for (int i = 0; fibonacci(i) <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

}
