package lesson_3;

import java.time.LocalTime;
import java.util.ArrayList;

public class Park {
    private String name;
    private ArrayList<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, LocalTime openingTime,
                              LocalTime closingTime, double price) {
        attractions.add(new Attraction(name, openingTime, closingTime, price));
    }

    @Override
    public String toString() {
        return "Park{" +
                "name='" + name + '\'' +
                ", attractions=" + attractions +
                '}';
    }

    public class Attraction {
        private String name;
        private LocalTime openingTime;
        private LocalTime closingTime;
        private double price;

        public Attraction(String name, LocalTime openingTime,
                          LocalTime closingTime, double price) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction: " + name +
                    "\nHours: " + openingTime + " - " + closingTime +
                    "\nPrice: " + price;
        }
    }
}