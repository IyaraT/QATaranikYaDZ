package lesson_6.ex2;

import java.util.*;

class PhoneBook {

    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {

        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }

        phoneBook.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {

        if (phoneBook.containsKey(surname)) {
            return phoneBook.get(surname);
        }

        return new ArrayList<>();
    }
}