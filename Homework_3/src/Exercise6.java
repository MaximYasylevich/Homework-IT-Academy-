import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int controller;
        long number = 0L;
        long factorial = 1L;

        System.out.print("Введите число: ");

        do {
            controller = 0;
            try{
                number = scanner.nextLong();
            } catch(Exception e) {
                System.out.print("Некорректный ввод данных, попробуйте еще раз: ");
                scanner.nextLine();
                controller = -1;
            }
        } while(controller == -1);

        if (number >= 0) {

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Факториал введенного числа: " + factorial);

        } else {
            System.out.println("Число < 0!!!");
        }

    }

}