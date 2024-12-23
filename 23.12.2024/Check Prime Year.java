import java.util.Scanner;

public class PrimeYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean isPrime = year > 1;
        for (int i = 2; i <= Math.sqrt(year); i++) {
            if (year % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(year + (isPrime ? " is a prime year." : " is not a prime year."));
    }
}
