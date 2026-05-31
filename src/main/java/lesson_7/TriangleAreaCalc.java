package lesson_7;

public class TriangleAreaCalc {
    public double calculateArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Сторона и высота должны быть положительными");
        }
        return base * height / 2;
    }
}