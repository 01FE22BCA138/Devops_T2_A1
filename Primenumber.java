import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter ur range");

        int n = s.nextInt();
        for (int i = 2; i < n; i++) {
            int factors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }
            if (factors == 2) {
                System.out.println(i);
            }
        }
    }
}