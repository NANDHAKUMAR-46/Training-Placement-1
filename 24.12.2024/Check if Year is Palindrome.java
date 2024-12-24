import java.util.Scanner;

public class CheckPalindromeYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        String yearStr = Integer.toString(year);
        String reverseYearStr = new StringBuilder(yearStr).reverse().toString();

        if (yearStr.equals(reverseYearStr)) {
            System.out.println(year + " is a palindrome year.");
        } else {
            System.out.println(year + " is not a palindrome year.");
        }
    }
}
