public class Recursion {
    public static void main(String[] args) {
        int number = 20; // Example number
        double result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static double factorial(int n) {
        if (n == 0) {  // Base case
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
}
