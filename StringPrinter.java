public class StringPrinter {
    public static void printStringMultipleTimes(String text, int count) {
        if (count <= 0) {
            System.out.println("Количество повторений должно быть положительным числом");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        printStringMultipleTimes("Привет!", 5);
    }
}

