package main;

import java.util.Scanner;

public class AdminView {

    static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Добавить игрушку");
            System.out.println("2 - Редактировать игрушку");
            System.out.println("3 - Удалить игрушки(количество)");
            System.out.println("4 - Удалить игрушки(полностью)");
            System.out.println("5 - Посмотреть игрушки");
            System.out.println("6 - Вернуться в главное меню");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите название игрушки: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Введите количество игрушек: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Введите вероятность игрушки: ");
                    double probability = scanner.nextDouble();
                    Presenter.addToy(name, quantity, probability);


                    break;
                case 2:
                    System.out.print("Введите ID игрушки для редактирования: ");
                    int id = scanner.nextInt();
                    System.out.print("Введите новое название игрушки: ");
                    scanner.nextLine();
                    String newName = scanner.nextLine();
                    System.out.print("Введите новое количество игрушек: ");
                    int newQuantity = scanner.nextInt();
                    System.out.print("Введите вероятность новой игрушки: ");
                    double newProbability = scanner.nextDouble();
                    Presenter.editToy(id, newName, newQuantity, newProbability);
                    break;
                case 3:
                    System.out.print("Введите ID игрушки, которую нужно удалить: ");
                    int idToRemove = scanner.nextInt();
                    System.out.print("Введите количество игрушк, которых нужно удалить: ");
                    int quantityToRemove = scanner.nextInt();
                    Presenter.removeQuantityToy(idToRemove,quantityToRemove);
                    break;
                case 4:
                    System.out.print("Введите ID игрушки, которую нужно удалить: ");
                    int idRemove = scanner.nextInt();
                    Presenter.removeToy(idRemove);
                    break;
                case 5:
                    Presenter.viewToys();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите еще раз.");
            }
        }
    }
}

