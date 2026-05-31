package lesson_6.ex2;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "111-111");
        phoneBook.add("Петров", "222-222");
        phoneBook.add("Иванов", "333-333");
        phoneBook.add("Сидоров", "444-444");

        System.out.println("Телефоны Иванова:");
        System.out.println(phoneBook.get("Иванов"));

        System.out.println("Телефоны Петрова:");
        System.out.println(phoneBook.get("Петров"));

        System.out.println("Телефоны Смирнова:");
        System.out.println(phoneBook.get("Смирнов"));
    }
}