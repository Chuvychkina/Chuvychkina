public class NumberChecker {

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {

        System.out.println(isSumInRange(5, 10));
        System.out.println(isSumInRange(1, 2));
        System.out.println(isSumInRange(15, 5));
        System.out.println(isSumInRange(20, 1));
    }
}

