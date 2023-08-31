package main;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Ты игрок?");
            System.out.println("2 - Ты администратор?");
            System.out.println("3 - Выйти");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    UserView.showMenu();
                    break;
                case 2:
                    AdminView.showMenu();
                    break;
                case 3:
                    System.out.println("Выход...");
                    Presenter.saveToysToFile();
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите еще раз");
            }
        }
    }
}
