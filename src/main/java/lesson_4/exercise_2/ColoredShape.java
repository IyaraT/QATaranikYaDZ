package lesson_4.exercise_2;

public class ColoredShape implements Shape{
    private String fillColor;
    private String borderColor;

    public ColoredShape(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public void printInfo() {
        Shape.super.printInfo();
    }
}