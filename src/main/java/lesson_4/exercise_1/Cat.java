package lesson_4.exercise_1;

public class Cat extends Animal {

    private static int catCount = 0;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        this.satiety = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public void eat(Plate bowl, int amount) {
        if (bowl.getFood() >= amount) {
            bowl.decreaseFood(amount);
            satiety = true;
            System.out.println(name + " покушал");
        } else {
            System.out.println(name + " не смог покушать");
        }
    }

    public void info() {
        System.out.println("Кот: " + name + ", сытость: " + (satiety ? "сыт" : "голоден"));
    }

    public static int getCatCount() {
        return catCount;
    }
}