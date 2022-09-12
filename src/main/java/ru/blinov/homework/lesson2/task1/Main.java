package ru.blinov.homework.lesson2.task1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static class Person {
        final int id;
        final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return getId() == person.getId() && getName().equals(person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }
    }

    private static final Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"),
            new Person(1, "Harry"),
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia")
    };

    public static void main(String[] args) {

        System.out.println("\nRaw data:");
        System.out.println();

        Person[] people = RAW_DATA;

        Predicate<Person> predicate = person ->
                Objects.nonNull(person) && Objects.nonNull(person.getName());

        List<Person> peopleFiltered = Arrays.stream(people).filter(predicate).toList();

        for (Person person : peopleFiltered) {
            System.out.println(person.id + " - " + person.name);
        }

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
        System.out.println();

        Map<String, List<Person>> map = groupByName(people);

        map.forEach((key, value) -> {
            System.out.println(key + ":");
            for (int i = 0; i < value.size(); i++) {
                Person person = value.get(i);
                System.out.println((i + 1) + " - " + person.getName() + " (" + person.getId() + ")");
            }
        });

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Result: ");
        System.out.println();

        map.forEach((key, value) ->
                System.out.println("Key: " + key + "\nValue: " + value.size()));
    }

    private static Map<String, List<Person>> groupByName(Person[] people) {

        Predicate<Person> predicate = person ->
                Objects.nonNull(person) && Objects.nonNull(person.getName());

        return Stream.ofNullable(people)
                .flatMap(Stream::of).toList().stream()
                .filter(predicate)
                .distinct()
                .collect(Collectors.groupingBy(Person::getName, TreeMap::new,
                        Collectors.collectingAndThen(Collectors.toList(),
                                e -> e.stream().sorted(Comparator.comparingInt(Person::getId))
                                        .collect(Collectors.toList()))));
    }
}
