class numberChecker {

    public static boolean isNegative(int number) {
        return number < 0;
    }
}  public class Main {
    public static void main(String[] args) {
        System.out.println(numberChecker.isNegative(-5));
        System.out.println(numberChecker.isNegative(0));
        System.out.println(numberChecker.isNegative(10));
    }
}

