import java.util.Scanner;

public class ModulusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to find the modulus:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Modulus: " + (num1 % num2));
    }
}
