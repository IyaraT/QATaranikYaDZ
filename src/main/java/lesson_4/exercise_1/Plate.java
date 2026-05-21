package lesson_4.exercise_1;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("В тарелке: " + food);
    }
}