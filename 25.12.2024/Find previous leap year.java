import java.util.Scanner;

public class PreviousLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        while (true) {
            year--;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The previous leap year is: " + year);
                break;
            }
        }
    }
}
