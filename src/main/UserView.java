package main;

import java.util.Scanner;

public class UserView {
    static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Играть в игру");
            System.out.println("2 - Вернуться в главное меню");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Presenter.playGame();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите еще раз.");
            }
        }
    }
}

