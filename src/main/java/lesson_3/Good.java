package lesson_3;

import java.time.LocalDate;

public class Good {
    private String name;
    private LocalDate productionDate;
    private String manufacturer;
    private String originCountry;
    private double price;
    private boolean stateReserve;

    public Good(String name, LocalDate productionDate, String manufacturer,String originCountry, double price, boolean stateReserve) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.price = price;
        this.stateReserve = stateReserve;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", productionDate=" + productionDate +
                ", manufacturer='" + manufacturer + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", price=" + price +
                ", stateReserve=" + stateReserve +
                '}';
    }
}