import java.util.Scanner;

public class GregorianCalendarCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582) {
            System.out.println(year + " is in the Gregorian calendar.");
        } else {
            System.out.println(year + " is in the Julian calendar.");
        }
    }
}
