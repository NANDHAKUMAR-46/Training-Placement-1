import java.util.Scanner;

public class OlympicYearFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " is an Olympic year.");
        } else {
            System.out.println(year + " is not an Olympic year.");
        }
    }
}
