package lession4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Phonebook {
    private static final Map<String, List<String>> phonebook = new HashMap<>();

    public static void add(String name, String... phonesAdd) {
        if (phonebook.get(name) != null) {
            List<String> phones = new ArrayList<>(phonebook.get(name));
            phones.addAll(List.of(phonesAdd));
            phonebook.put(name, phones);
        } else {
            phonebook.put(name, List.of(phonesAdd));
        }
    }


    public static void get(String name) {
        System.out.printf("%s: %s\n", name, phonebook.get(name));
    }
}
