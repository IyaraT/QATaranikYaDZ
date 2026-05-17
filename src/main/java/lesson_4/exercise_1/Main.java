package lesson_4.exercise_1;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Бигус");
        Cat cat1 = new Cat("Гоша", 10);
        Cat cat2 = new Cat("Шлепа", 15);
        Cat cat3 = new Cat("Георг", 20);

        dog.run(150);
        dog.swim(8);

        cat1.run(100);
        cat1.swim(5);

        System.out.println();

        System.out.println("Животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());

        System.out.println();

        Plate plate = new Plate(30);

        plate.info();

        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
        }

        System.out.println();

        for (Cat cat : cats) {
            cat.info();
        }

        System.out.println();

        plate.addFood(20);
        plate.info();
    }
}