public class YearPalindrome {
    public static void main(String[] args) {
        for (int year = 1000; year <= 9999; year++) {
            String str = String.valueOf(year);
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                System.out.println(year + " is a palindrome year.");
            }
        }
    }
}
