public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        // Год високосный, если делится на 4
        if (year % 4 == 0) {
            // Но если год делится на 100, он не високосный
            if (year % 100 == 0) {
                // Однако если год делится на 400, он всё равно високосный
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2021));
    }}

