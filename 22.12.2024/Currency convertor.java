import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in USD:");
        double usd = sc.nextDouble();

        double inr = usd * 82.0; // Example conversion rate
        System.out.println("Equivalent in
