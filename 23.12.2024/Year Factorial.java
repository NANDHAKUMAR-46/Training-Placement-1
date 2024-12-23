public class YearFactorial {
    public static void main(String[] args) {
        int year = 5; // Example: finding 5!
        int factorial = 1;

        for (int i = 1; i <= year; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + year + " is " + factorial);
    }
}
