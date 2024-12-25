import java.util.Scanner;

public class DivisibilityBy400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is divisible by 400.");
        } else {
            System.out.println(year + " is not divisible by 400.");
        }
    }
}
