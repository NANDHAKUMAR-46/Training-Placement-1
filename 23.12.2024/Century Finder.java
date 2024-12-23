import java.util.Scanner;

public class CenturyFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        int century = (year / 100) + ((year % 100 == 0) ? 0 : 1);
        System.out.println(year + " falls in the " + century + "th century.");
    }
}
