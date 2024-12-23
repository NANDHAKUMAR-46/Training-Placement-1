import java.util.Scanner;

public class YearValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year > 0) {
            System.out.println(year + " is a valid year.");
        } else {
            System.out.println(year + " is not a valid year.");
        }
    }
}
