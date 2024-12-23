import java.util.Scanner;

public class YearDifferenceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first year: ");
        int year1 = sc.nextInt();
        System.out.print("Enter the second year: ");
        int year2 = sc.nextInt();

        System.out.println("The difference between years is: " + Math.abs(year1 - year2));
    }
}
