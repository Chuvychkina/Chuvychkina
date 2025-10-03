package lesson_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String surname, String phone) {
        phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phone);
    }

    // Метод для поиска номеров по фамилии
    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    // Пример использования
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи
        phoneBook.add("Иванов", "+7-123-456-78-90");
        phoneBook.add("Иванов", "+7-987-654-32-10");
        phoneBook.add("Петров", "+7-555-123-45-67");
        phoneBook.add("Сидоров", "+7-999-888-77-66");

        // Ищем номера
        System.out.printf("Номера Ивановых: %s%n", phoneBook.get("Иванов"));
        System.out.printf("Номера Петровых: %s%n", phoneBook.get("Петров"));
        System.out.printf("Номера Сидоровых: %s%n", phoneBook.get("Сидоров"));
        System.out.printf("Номера для несуществующей фамилии: %s%n", phoneBook.get("Неизвестный"));
    }
}
