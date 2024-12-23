import java.util.Scanner;

public class OddEvenYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 2 == 0) {
            System.out.println(year + " is an even year.");
        } else {
            System.out.println(year + " is an odd year.");
        }
    }
}
