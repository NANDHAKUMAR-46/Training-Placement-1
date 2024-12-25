import java.util.Scanner;

public class SumOfYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting year: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending year: ");
        int end = sc.nextInt();

        int sum = 0;
        for (int year = start; year <= end; year++) {
            sum += year;
        }
        System.out.println("The sum of years from " + start + " to " + end + " is " + sum);
    }
}
