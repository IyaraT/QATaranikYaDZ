package lesson_6.ex1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void removeBadStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();

            if (student.getAverageGrade() < 3) {
                iterator.remove();
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:");

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван", "A1", 1, Arrays.asList(5, 4, 4, 5)));
        students.add(new Student("Петр", "A1", 1, Arrays.asList(2, 3, 2, 2)));
        students.add(new Student("Анна", "B2", 2, Arrays.asList(4, 5, 5, 4)));

        removeBadStudents(students);

        for (Student student : students) {
            student.nextCourse();
        }

        printStudents(students, 2);

        System.out.println("\nВсе студенты:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}