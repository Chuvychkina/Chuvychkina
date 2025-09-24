public class NumChecker {
    /**
     * Метод для проверки знака числа
     * @param number проверяемое число
     */
    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void main(String[] args) {
        // Примеры использования
        checkNumberSign(10);   // Выведет: Число положительное
        checkNumberSign(-5);   // Выведет: Число отрицательное
        checkNumberSign(0);    // Выведет: Число положительное
    }
}

