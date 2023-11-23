public class Recursion {
    public static void main(String[] args) {
        int term = 20; // Example number
        double result = fibonacci(term);
        System.out.println("Fibinacci of " + term + " is: " + result);
    }

    public static double fibonacci(int n) {
        if (n <= 1) {  // Base case
          return n;
        } else {
            return fibonacci(n-2) + fibonacci(n-1); // Recursive call
        }
    }
}

