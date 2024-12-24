public class YearWithMaxDays {
    public static void main(String[] args) {
        for (int year = 2000; year <= 2024; year++) {
            boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(year + " has " + (leap ? 366 : 365) + " days.");
        }
    }
}
