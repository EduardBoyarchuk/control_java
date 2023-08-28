package main;

import java.util.Scanner;

public class ViewGamer {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
            while (true) {
            System.out.println("1 - Розыгрыш");
            System.out.println("2 - Выход");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:
                    ViewMain app = new ViewMain();
                    app.showMenu();
                default:
                    System.out.println("Неверно. Введите уще раз");
            }
        }
    }
}
