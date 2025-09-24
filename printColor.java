public class printColor {
    public static void printColor() {
        int value = 50; // можно изменить значение

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void main(String[] args) {
        printColor();
    }
}
