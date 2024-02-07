import java.util.Scanner;
class NextPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println(num + " is " + (isPrime(num) ? "prime." : "not prime."));

        int count = 0;
        int currentNumber = num + 1;

        System.out.println("Next 10 prime numbers from " + num + " are:");

        while (count < 10) {
            if (isPrime(currentNumber)) {
                System.out.println(currentNumber);
                count++;
            }
            currentNumber++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }
}


