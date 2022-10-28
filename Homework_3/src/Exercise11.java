import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int controller;
        int counterDivisors;

        System.out.print("Введите число: ");

        do {
            controller = 0;
            try {
                number = scanner.nextInt();
            } catch (Exception e) {
                System.out.print("Некорректно введены данные, попробуйте еще раз: ");
                scanner.nextLine();
                controller = -1;
            }
        } while (controller == -1);

        counterDivisors = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                counterDivisors++;

                if (counterDivisors > 2) {
                    break;
                }

            }

        }

        if (counterDivisors == 2) {
            System.out.println("Число " + number + " явялется простым!");
        } else {
            System.out.println("Число " + number + " не является простым числом!");
        }

    }

}
