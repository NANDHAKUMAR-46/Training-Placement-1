import java.util.Scanner;

public class YearSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        int sqrt = (int) Math.sqrt(year);
        if (sqrt * sqrt == year) {
            System.out.println(year + " is a perfect square.");
        } else {
            System.out.println(year + " is not a perfect square.");
        }
    }
}
