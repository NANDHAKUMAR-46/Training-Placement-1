import java.util.Scanner;

public class MillenniumFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        int millennium = (year / 1000) + ((year % 1000 == 0) ? 0 : 1);
        System.out.println(year + " falls in the " + millennium + " millennium.");
    }
}
