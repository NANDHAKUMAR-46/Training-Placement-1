import java.util.Scanner;

public class ReverseYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        int reverse = 0;
        while (year != 0) {
            reverse = reverse * 10 + year % 10;
            year /= 10;
        }
        System.out.println("Reversed year: " + reverse);
    }
}
