package lesson_4.exercise_1;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Бигус");
        Cat cat1 = new Cat("Гоша");
        Cat cat2 = new Cat("Шлепа");
        Cat cat3 = new Cat("Георг");

        dog.run(150);
        dog.swim(8);

        cat1.run(100);
        cat1.swim(5);

        System.out.println();

        System.out.println("Животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());

        Plate plate = new Plate(25);

        plate.info();

        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(plate, 10);
            plate.info();
        }

        for (Cat cat : cats) {
            cat.info();
        }
    }
}