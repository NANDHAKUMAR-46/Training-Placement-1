import java.util.Scanner;

public class DecadeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        System.out.println(year + " falls in the " + (year / 10) * 10 + "s decade.");
    }
}
