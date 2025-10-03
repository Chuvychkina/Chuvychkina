package lesson_6;

import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades; // Предмет -> оценка (1-5)

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>(grades);
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    // Метод для вычисления среднего балла
    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{name='%s', group='%s', course=%d, average=%s}".formatted(name, group, course, String.format("%.2f", getAverageGrade()));
    }

    // Метод для удаления студентов со средним баллом < 3
    public static void removeLowGradeStudents(Collection<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

    // Метод для перевода студентов на следующий курс, если средний балл >= 3
    public static void promoteStudents(Collection<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    // Метод для печати студентов по курсу
    public static void printStudents(Set<Student> students, int course) {
        System.out.printf("Студенты на курсе %d:%n", course);
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
