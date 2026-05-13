package lesson_3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Good[] productsArray = new Good[5];
        productsArray[0] = new Good("Flubus", LocalDate.of(2022, 12,12), "Bepsi",  "Bepsiland", 0.21, true);
        productsArray[1] = new Good("Snorble", LocalDate.of(2023, 3, 5), "Sneem", "Sneemwille", 1.49, true);
        productsArray[2] = new Good("Zapple", LocalDate.of(2021, 8, 19), "Gleesies", "Glossburg", 0.89, false);
        productsArray[3] = new Good("Bratwurst", LocalDate.of(2024, 1, 27), "Trungo's", "United States of America", 2.35, true);
        productsArray[4] = new Good("Moolix", LocalDate.of(2022, 6, 14), "Moofacture", "Milkland", 1.15, false);

        System.out.println(productsArray[0].toString());

        Park park1 = new Park("Goobaland");

        park1.addAttraction("Soup Elevator", LocalTime.of(10, 0), LocalTime.of(18, 0), 4.5);
        park1.addAttraction("Sock Aquarium", LocalTime.of(11, 30), LocalTime.of(17, 0), 2.99);
        park1.addAttraction("Cabbage Launcher", LocalTime.of(9, 45), LocalTime.of(20, 15), 6.1);
        park1.addAttraction("Toaster Zoo", LocalTime.of(12, 0), LocalTime.of(16, 30), 7.27);

        System.out.println(park1.toString());
    }
}