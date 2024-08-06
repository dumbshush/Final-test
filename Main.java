import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Элли", LocalDate.of(2024, 04, 9), "Умеет просить");
        Cat cat2 = new Cat("Пончо", LocalDate.of(2021, 07, 01), "Умеет прыгать через кольцо");
        Dog dog1 = new Dog("Лолли", LocalDate.of(2022, 02, 22), "Умеет давать лапку");
        Hamster hamster1 = new Hamster("Пуддлз", LocalDate.of(2024, 01, 24), "Умеет делать сальто");
        Horse horse1 = new Horse("Дэйзи", LocalDate.of(2023, 10, 04), null);
        Horse horse2 = new Horse("Кэлли", LocalDate.of(2023, 9, 30), "'Умеет бежать голопом");
        Camel camel1 = new Camel("Гриззли", LocalDate.of(2022, 03, 13), "Умеет удерживать еду на носу");
        Donkey donkey1 = new Donkey("Хак", LocalDate.of(2020, 12, 28), null);

        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        Set<Horse> set1 = new HashSet<>();
        set1.add(horse1);
        set1.add(horse2);

        System.out.println(set);
        System.out.println(dog1);
        System.out.println(hamster1);
        System.out.println(set1);
        System.out.println(camel1);
        System.out.println(donkey1);
    }
}
