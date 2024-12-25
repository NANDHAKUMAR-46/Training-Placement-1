import java.util.Scanner;

public class DecadeStartYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        int decadeStart = (year / 10) * 10;
        System.out.println("The decade started in: " + decadeStart);
    }
}
