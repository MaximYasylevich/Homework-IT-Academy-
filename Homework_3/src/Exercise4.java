import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumOfDigits = 0;
        int productOfDigits = 1;
        int controller;
        int number = 0;
        int digit;

        System.out.print("Введите число: ");

        do {
            controller = 0;
            try{
                number = scanner.nextInt();
            } catch(Exception e) {
                System.out.print("Некорректный ввод данных, попробуйте еще раз: ");
                scanner.nextLine();
                controller = -1;
            }
        } while(controller == -1);

        while(number > 0) {

            digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;

        }

        System.out.printf("Сумма цифр введенного числа: %d\n", sumOfDigits);
        System.out.printf("Произведение цифр введенного числа: %d\n", productOfDigits);

    }

}
