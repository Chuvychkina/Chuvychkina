public class checkSumSign {
    public static void checkSumSign() {
        int a = 5; // можно изменить значение
        int b = -3; // можно изменить значение
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {
        checkSumSign();
    }
}

