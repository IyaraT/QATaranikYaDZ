package lesson_4.exercise_1;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("Добавили " + amount + " еды.");
    }

    public void info() {
        System.out.println("В миске: " + food + " еды.");
    }
}