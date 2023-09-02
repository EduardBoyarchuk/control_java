package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Presenter {

    private static final String FILENAME = "toys.csv";
    private static final int MAX_TOYS = 15;
    private static List<Toy> toys = new ArrayList<>();
    private static Random random = new Random();

    static {
        loadToysFromFile();
    }

    static void saveToysToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Toy toy : toys) {
                writer.println(toy.id + "," + toy.name + "," + toy.quantity + "," + toy.probability);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void loadToysFromFile() {
        try (Scanner scanner = new Scanner(new File(FILENAME))) {
            toys.clear();
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                if (data.length == 4) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int quantity = Integer.parseInt(data[2]);
                    double probability = Double.parseDouble(data[3]);
                    toys.add(new Toy(id, name, quantity, probability));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void addToy(String name, int quantity, double probability) {
            int id = toys.size() + 1;
            toys.add(new Toy(id, name, quantity, probability));
            saveToysToFile();
            System.out.println("Игрушка успешно добавлена.");
    }

    static void editToy(int id, String newName, int newQuantity, double newProbability) {
        for (Toy toy : toys) {
            if (toy.id == id) {
                toy.name = newName;
                toy.quantity = newQuantity;
                toy.probability = newProbability;
                saveToysToFile();
                System.out.println("Игрушка успешно отредактирована.");
                return;
            }
        }
        System.out.println("Игрушка не найдена.");
    }

    static void removeQuantityToy(int id, int quantity) {
        for (Toy toy : toys) {
            if (toy.id == id) {
                toy.quantity--;
            }
            saveToysToFile();
        }
        System.out.println("Игрушка успешно удалена.");
    }

    static void removeToy(int id) {
        toys.removeIf(toy -> toy.id == id);
        saveToysToFile();
        System.out.println("Игрушка успешно удалена.");
    }

        static void playGame () {
            double maxProbability = -1.0;
            Toy winningToy = null;
            for (Toy toy : toys) {
                if (toy.probability > maxProbability && toy.quantity > 0) {
                    maxProbability = toy.probability;
                    winningToy = toy;
                }

            }


            if (winningToy != null) {
                System.out.println("Вы выиграли: " + winningToy.name);
                winningToy.quantity--;
                System.out.println("Поздравляем! Приз выдан.");
            } else {
                System.out.println("Игрушек больше нет.");
            }

        }




    static void viewToys() {
        for (Toy toy : toys) {
            System.out.println("ID: " + toy.id + ", Имя: " + toy.name + ", Количество: " + toy.quantity + ", Вероятность: " + toy.probability);
        }
    }
}


