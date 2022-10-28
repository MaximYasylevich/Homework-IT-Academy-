import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int lengthNumber = 0;
        int maxDigitIndex;
        int maxDigit;
        int controller;

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

        maxDigitIndex = 1;
        maxDigit = number % 10;

        while (number > 0){
            lengthNumber++;
            if (number % 10 > maxDigit) {
                maxDigit = number % 10;
                maxDigitIndex = lengthNumber;
            }
            number /= 10;
        }

        System.out.println("Максимальная цифра введенного числа: " + maxDigit);
        System.out.println("Индекс максимального числа: " + (lengthNumber - maxDigitIndex + 1));

    }

}