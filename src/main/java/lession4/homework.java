package lession4;

import java.util.*;

public class homework {


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList(
                "Dog", "Cat", "Nut", "Sun", "Dog", "Night", "Sun", "Cat", "Ball", "Car"

        ));

        printUniq(stringList);
        countWords(stringList);
        textPhonebook();
    }

    public static void printUniq(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        System.out.println(inputSet);
    }

    public static void countWords (List<String> input){
        Set<String> inputSet = new HashSet<>(input);
        for (String word : inputSet) {
            int count = 0;
            for (String inner : input) {
                if (word.equals((inner))) {
                    count++;
                }
            }
            System.out.printf("%s: %d\n", word, count);
        }
    }

    public static void textPhonebook() {
        Phonebook.add("Andy","+1234567");
        Phonebook.add("John","+1234568");
        Phonebook.add("Sam","+1234569");
        Phonebook.add("Alex","+1234566");
        Phonebook.add("Tim","+1234565");
        Phonebook.add("Johny","+1234564");

        Phonebook.get("Andy");
        Phonebook.get("John");
        Phonebook.get("Sam");
        Phonebook.get("Alex");
        Phonebook.get("Tim");
        Phonebook.get("Johny");


    }
}
