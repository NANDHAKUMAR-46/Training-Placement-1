public class YearInWords {
    public static void main(String[] args) {
        int year = 2024; // Example year
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        int thousand = year / 1000;
        int hundred = (year % 1000) / 100;
        int remaining = year % 100;

        String result = ones[thousand] + " Thousand " + ones[hundred] + " Hundred ";

        if (remaining >= 20) {
            result += tens[remaining / 10] + " " + ones[remaining % 10];
        } else {
            result += remaining == 0 ? "" : ones[remaining];
        }

        System.out.println("Year in words: " + result.trim());
    }
}
