import java.util.Scanner;

public class FutureYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();
        System.out.print("Enter years to add: ");
        int addYears = sc.nextInt();

        System.out.println("Future year: " + (currentYear + addYears));
    }
}
