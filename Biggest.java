public class Biggest {

    private static int findBiggest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int result = findBiggest(10, 20, 40);
        System.out.println("The biggest number is: " + result);
    }
}