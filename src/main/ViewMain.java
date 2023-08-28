package main;

import java.util.Scanner;

public class ViewMain {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean metka = true;
        while (metka) {
            System.out.println("1 - Вы игорок?");
            System.out.println("2 - Вы администратор?");
            System.out.println("3 - Выйти");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    metka = false;
                default:
                    System.out.println("Неверно. Введите уще раз");
            }
        }
    }
}
