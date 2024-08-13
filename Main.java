import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Animal> anml = new ArrayList<>();
        AnimalRegistry animalregistry = new AnimalRegistry();
        // animalregistry.initAnimals(anml);

        boolean start = true;

        anml.add(new Cat("Ellie", LocalDate.of(2024, 4, 9), "Cat", "Knows how to ask"));
        anml.add(new Cat("Poncho", LocalDate.of(2021, 7, 1), "Cat", "Can jump through a hoop"));
        anml.add(new Dog("Lolly", LocalDate.of(2022, 2, 22), "Dog", "Can give a paw"));
        anml.add(new Hamster("Puddles", LocalDate.of(2024, 1, 24), "Hamster", "Can do somersaults"));
        anml.add(new Horse("Daisy", LocalDate.of(2023, 10, 4), "Horse", null));
        anml.add(new Horse("Callie", LocalDate.of(2023, 9, 30), "Horse", "Can gallop"));
        anml.add(new Camel("Grizzly", LocalDate.of(2022, 3, 13), "Camel", "Can hold food on his nose"));
        anml.add(new Donkey("Hack", LocalDate.of(2020, 12, 28), "Donkey", null));

        for (Animal animal : anml) {
            animalregistry.addAnimal(animal);
        }

        while (start) {
            System.out.println();
            System.out.println("Добро пожаловать в реестр животных!\n\nЧем можем вам помочь?");
            System.out.println("\n1. Показать список животных.\n2. Выбрать животное.");
            System.out.println("3. Вписать новое животное.\n4. Обучить животное новым коммандам.");
            System.out.println("5. Выход."); 
            System.out.println("\nВыберите опцию:");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    animalregistry.listAnimals();
                    break;
                case 2:
                    System.out.println("Введите имя животного: ");
                    String name = scanner.nextLine().trim();
                    Animal animal = animalregistry.getAnimal(name);
                    if (animal != null) {
                        System.out.println(animal);
                    }else{
                        System.out.println("Животное не найдено.");
                    }
                    break;
                case 3:
                    System.out.println("Введите имя животного: ");
                    String newName = scanner.nextLine();
                    System.out.println("Введите дату рождения(год-месяц-день): ");
                    String newBirth = scanner.nextLine();
                    LocalDate birth = LocalDate.parse(newBirth);
                    System.out.println("Что это за животное? ");
                    String newType = scanner.nextLine().toLowerCase();
                    System.out.println("Что за команды оно знает? ");
                    String newCommand = scanner.nextLine();
                    Animal newAnimal;

                    if (newType.equals("cat") || newType.equals("dog") || newType.equals("hamster")) {
                        newAnimal = new DomesticAnimal(newName, birth, newType, newCommand);
                    } else if (newType.equals("horse") || newType.equals("camel") || newType.equals("donkey")) {
                        newAnimal = new PackAnimal(newName, birth, newType, newCommand);
                    } else {
                        newAnimal = new Animal(newName, birth, newType, newCommand); 
                    }

                    animalregistry.addAnimal(newAnimal);
                    break;
                case 4:
                    System.out.println("Введите имя животного: ");
                    String animalName = scanner.nextLine();
                    Animal selectedAnimal = animalregistry.getAnimal(animalName);
                    if (selectedAnimal != null) {
                        System.out.println("Введите новую команду/команды: ");
                        String newCommands = scanner.nextLine();
                        selectedAnimal.addCommands(newCommands);
                        System.out.println("Команда/команды добавлены.");;
                    }else{
                        System.out.println("Животное не найдено.");
                    }
                    break;
                case 5:
                    start = false;
                    break;
                default:
                    System.out.println("Пожалуйста, выберите цифру от 1 до 5.");
            }        
        }
        scanner.close();
        System.out.println("До свидания!");    
    }

}
