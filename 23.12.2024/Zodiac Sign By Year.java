import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        String[] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int year = sc.nextInt();
        System.out.println("Your Chinese Zodiac sign is: " + zodiac[year % 12]);
    }
}
