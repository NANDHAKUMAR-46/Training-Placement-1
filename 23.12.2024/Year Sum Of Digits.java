import java.util.Scanner;

public class YearDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        int sum = 0;
        while (year != 0) {
            sum += year % 10;
            year /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
