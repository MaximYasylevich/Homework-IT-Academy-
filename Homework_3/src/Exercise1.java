import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        int controller;
        int sizeOfTheMultiplicationTable = 0;
        int choice = 1;

        Scanner scanner = new Scanner(System.in);

        while (choice == 1) {

            System.out.print("Введите размер таблицы умножения: ");

            do {
                controller = 0;
                try {
                    sizeOfTheMultiplicationTable = scanner.nextInt();
                } catch (Exception e) {
                    System.out.print("Некорректно введены данные, попробуйте еще раз: ");
                    scanner.nextLine();
                    controller = -1;
                }
            } while (controller == -1);

            for (int i = 1; i <= sizeOfTheMultiplicationTable; i++) {
                System.out.printf("%d * 5 = %d\n", i, (i * 5));
            }

            System.out.print("Хотите продолжить? (1 - Да / 2 - Нет): ");

            do {
                controller = 0;
                try {
                    choice = scanner.nextInt();
                } catch (Exception e) {
                    System.out.print("Некорректно введены данные, попробуйте еще раз: ");
                    scanner.nextLine();
                    controller = -1;
                }
            } while (controller == -1);

        }

    }

}
