package lesson_5;

import static lesson_5.SumArray.demonstrateArrayIndexOutOfBounds;
import static lesson_5.SumArray.sum4x4Array;

public class Lesson_5 {
    static void main() {
        // Тест 1: Корректный массив
        System.out.println("=== Тест 1: Корректный массив 4x4 ===");
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sum4x4Array(correctArray);
            System.out.printf("Сумма элементов: %d%n", result);
        } catch (ArrayExceptionHandler.MyArraySizeException |
                 ArrayExceptionHandler.MyArrayDataException e) {
            System.out.printf("Ошибка: %s%n", e.getMessage());
        }// Тест 2: Массив неправильного размера
        System.out.println("\n=== Тест 2: Массив неправильного размера ===");
        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        try {
            int result = sum4x4Array(wrongSizeArray);
            System.out.printf("Сумма элементов: %d%n", result);
        } catch (ArrayExceptionHandler.MyArraySizeException e) {
            System.out.printf("MyArraySizeException: %s%n", e.getMessage());
        } catch (ArrayExceptionHandler.MyArrayDataException e) {
            System.out.printf("MyArrayDataException: %s%n", e.getMessage());
        }

        // Тест 3: Массив с некорректными данными
        System.out.println("\n=== Тест 3: Массив с некорректными данными ===");
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "seven", "8"}, // Некорректные данные
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sum4x4Array(invalidDataArray);
            System.out.printf("Сумма элементов: %d%n", result);
        } catch (ArrayExceptionHandler.MyArraySizeException e) {
            System.out.printf("MyArraySizeException: %s%n", e.getMessage());
        } catch (ArrayExceptionHandler.MyArrayDataException e) {
            System.out.printf("MyArrayDataException: %s%n", e.getMessage());
        }

        // Тест 4: Массив с null значениями
        System.out.println("\n=== Тест 4: Массив с null значениями ===");
        String[][] nullDataArray = {
                {"1", "2", "3", "4"},
                {"5", null, "7", "8"}, // null значение
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sum4x4Array(nullDataArray);
            System.out.printf("Сумма элементов: %d%n", result);
        } catch (ArrayExceptionHandler.MyArraySizeException e) {
            System.out.printf("MyArraySizeException: %s%n", e.getMessage());
        } catch (ArrayExceptionHandler.MyArrayDataException e) {
            System.out.printf("MyArrayDataException: %s%n", e.getMessage());
        }

        // Тест 5: Демонстрация работы с двумерным массивом неправильной структуры
        System.out.println("\n=== Тест 5: Неправильная структура массива ===");
        String[][] jaggedArray = {
                {"1", "2", "3", "4"},
                {"5", "6"}, // Неправильное количество столбцов
                {"7", "8", "9", "10"},
                {"11", "12", "13", "14"}
        };

        try {
            int result = sum4x4Array(jaggedArray);
            System.out.printf("Сумма элементов: %d%n", result);
        } catch (ArrayExceptionHandler.MyArraySizeException e) {
            System.out.printf("MyArraySizeException: %s%n", e.getMessage());
        } catch (ArrayExceptionHandler.MyArrayDataException e) {
            System.out.printf("MyArrayDataException: %s%n", e.getMessage());
        }

        // Демонстрация ArrayIndexOutOfBoundsException
        demonstrateArrayIndexOutOfBounds();

        // Дополнительный тест: граничные случаи
        System.out.println("\n=== Дополнительные тесты ===");

        // Тест с пустыми строками
        String[][] emptyStringsArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "", "8"}, // Пустая строка
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sum4x4Array(emptyStringsArray);
            System.out.printf("Сумма элементов: %d%n", result);
        } catch (ArrayExceptionHandler.MyArraySizeException |
                 ArrayExceptionHandler.MyArrayDataException e) {
            System.out.printf("Ошибка: %s%n", e.getMessage());
        }// Тест с большими числами
        String[][] largeNumbersArray = {
                {"100", "200", "300", "400"},
                {"500", "600", "700", "800"},
                {"900", "1000", "1100", "1200"},
                {"1300", "1400", "1500", "1600"}
        };

        try {
            int result = sum4x4Array(largeNumbersArray);
            System.out.printf("Сумма элементов: %d%n", result);
        } catch (ArrayExceptionHandler.MyArraySizeException |
                 ArrayExceptionHandler.MyArrayDataException e) {
            System.out.printf("Ошибка: %s%n", e.getMessage());
        }
    }
    }

