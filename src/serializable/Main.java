package serializable;

import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        File file = Path.of("resource", "person.out").toFile();
        writeObject(file);

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            Person object = (Person) input.readObject();
            String name = object.getName();
            int age = object.getAge();
            System.out.println("name "+ name + "age =" + age);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void writeObject(File file) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {
            Address address = new Address();
            Person ivan = new Person("Ivan", 35, address);
            output.writeObject(ivan);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
