import java.util.Scanner;

public class YearDivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.print("Enter a number to check divisibility: ");
        int number = sc.nextInt();

        if (year % number == 0) {
            System.out.println(year + " is divisible by " + number + ".");
        } else {
            System.out.println(year + " is not divisible by " + number + ".");
        }
    }
}
