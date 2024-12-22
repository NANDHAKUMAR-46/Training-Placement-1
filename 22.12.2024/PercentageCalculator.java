import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total marks:");
        double total = sc.nextDouble();

        System.out.println("Enter the obtained marks:");
        double obtained = sc.nextDouble();

        double percentage = (obtained / total) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}
