//
// დავალება 11
//

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            // 1. ფოლდერისა და ფაილის შექმნა
            System.out.println("** 1 ** - ფოლდერისა და ფაილის შექმნა");
            Path workingFolder = Paths.get("/Users/thattim/Desktop", "Working Folder", "All Files");
            Files.createDirectories(workingFolder);
            Path myFile = workingFolder.resolve("My File.txt");
            Files.createFile(myFile);

            // 2. ტექსტის ჩაწერა
            System.out.println("** 2 ** - ფაილში ტექსტის ჩაწერრა");
            Files.writeString(myFile, "Hello world!");

            // 3. ფაილის კონტენტის გამოტანა
            System.out.println("** 3 ** - ფაილის კონტენტი");
            System.out.println("ფაილის კონტენტი - " + Files.readString(myFile));

            // 4. წავშალოთ ფაილი
            System.out.println("** 4 ** - ფაილის წაშლა");
            Files.delete(myFile);

            // 5. ახალი ფაილის შექმნა
            System.out.println("** 5 ** - ახალი ფაილის შექმნა");
            Path personsFile = workingFolder.resolve("Persons.txt");
            if (!Files.exists(personsFile)) {
                Files.createFile(personsFile);
            }

            // 6. Person
            System.out.println("** 6 ** - Person კლასის შექმნა");
            class Person {
                String firstName;
                String lastName;
                int age;
                Gender gender;
                double height;
                double weight;

                enum Gender { Male, Female }

                Person(String firstName, String lastName, int age, Gender gender, double height, double weight) {
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.age = age;
                    this.gender = gender;
                    this.height = height;
                    this.weight = weight;
                }

                @Override
                public String toString() {
                    return firstName + " " + lastName + ", " + age + " წლის, " + gender + ", სიმაღლე - " + height + ", წონა - " + weight;
                }
            }

            // 7. Person კლასის 5 ობიექტის შექმნა
            System.out.println("** 7 ** - კლასის ობიექტების შექმნა");
            List<Person> people = new ArrayList<>();
            people.add(new Person("P1", "P1", 25, Person.Gender.Male, 1.8, 75));
            people.add(new Person("P2", "P2", 18, Person.Gender.Female, 1.6, 60));
            people.add(new Person("P3", "P3", 19, Person.Gender.Female, 1.65, 62));
            people.add(new Person("P4", "P4", 20, Person.Gender.Male, 1.75, 80));
            people.add(new Person("P5", "P6", 21, Person.Gender.Female, 1.7, 55));

            // 9. სიის ჩაწერა ფაილში
            System.out.println("** 9 ** - სიის ჩაწერა");
            try (BufferedWriter writer = Files.newBufferedWriter(personsFile)) {
                for (Person person : people) {
                    writer.write(person.toString());
                    writer.newLine();
                }
            }

            // 10. ფაილის კონტენტის გამოტანა
            System.out.println("** 10 ** - Person ფაილის კონტენტი");
            Files.lines(personsFile).forEach(System.out::println);

            // 11. ასაკის გადაწერა
            System.out.println("** 11 ** - ასაკის გადაწერა");
            for (Person person : people) {
                person.age += 1;
            }

            try (BufferedWriter writer = Files.newBufferedWriter(personsFile)) {
                for (Person person : people) {
                    writer.write(person.toString());
                    writer.newLine();
                }
            }

            // 12. ფაილების სახელების დაბეჭდვა
            System.out.println("** 12 ** - ფაილების სახელების დაბეჭდვა");
            Files.list(workingFolder).forEach(path -> System.out.println(path.getFileName()));

            // 13. Person.txt-ის ინფო
            System.out.println("** 13 ** - Person.txt-ის ინფო");
            System.out.println("ფაილის დასახელება - " + personsFile.getFileName());
            System.out.println("ფაილის ზომა - " + Files.size(personsFile));
            System.out.println("ფაილის მისამართი - " + personsFile.toAbsolutePath());
            System.out.println("ჩაწერადი - " + Files.isWritable(personsFile));
            System.out.println("წაკითხვადი - " + Files.isReadable(personsFile));

            // 14. ტექსტის დამატება
            System.out.println("** 14 ** - ტექსტის დამატება");
            Files.writeString(personsFile, "This is the end of task", StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
