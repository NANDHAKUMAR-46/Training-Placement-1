import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight (kg) and height (m):");
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
    }
}
