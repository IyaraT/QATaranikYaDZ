package lesson_4.exercise_2;

public interface Shape {

    double getArea();
    double getPerimeter();
    String getFillColor();
    String getBorderColor();

    default void printInfo() {
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println();
    }
}