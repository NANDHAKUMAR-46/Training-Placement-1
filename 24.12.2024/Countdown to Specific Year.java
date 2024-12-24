import java.util.Scanner;

public class CountdownToYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();
        System.out.print("Enter a target year: ");
        int targetYear = sc.nextInt();

        if (targetYear >= currentYear) {
            System.out.println("Years left: " + (targetYear - currentYear));
        } else {
            System.out.println("The target year is in the past.");
        }
    }
}
