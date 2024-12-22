import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal, rate (%), time (years), and number of times interest applied per year:");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double n = sc.nextDouble();

        double amount = principal * Math.pow((1 + rate / (100 * n)), n * time);
        System.out.println("Compound Interest: " + (amount - principal));
    }
}
