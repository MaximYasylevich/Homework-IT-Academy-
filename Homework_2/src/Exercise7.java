import java.util.Scanner;

public class Exercise7 {

    public static void main(String args[]){

        int number;
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.print("Введите целое число: ");
            number = in.nextInt();

            if (number % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }

            System.out.print("Хотите продолжить? (1 - Да / 2 - Нет): ");
            if (in.nextInt() == 2)
                break;

        }

    }

}
