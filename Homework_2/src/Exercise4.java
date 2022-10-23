import java.util.Scanner;

public class Exercise4 {

    public static void main(String args[]) {

        int a, b, c;
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.print("Введите число a: ");
            a = in.nextInt();
            System.out.print("Введите число b: ");
            b = in.nextInt();
            System.out.print("Введите число c: ");
            c = in.nextInt();

            if (a > c) {

                if (a < b) {
                    System.out.println("Среднее число a");
                } else {
                    if (b > c) {
                        System.out.println("Среднее число b");
                    } else {
                        System.out.println("Среднее число с");
                    }
                }

            } else {

                if (c < b) {
                    System.out.println("Среднее число c");
                } else {
                    if (b > a) {
                        System.out.println("Среднее число b");
                    } else {
                        System.out.println("Среднее число а");
                    }
                }

            }

            System.out.print("Хотите продолжить? (1 - Да / 2 - Нет): ");
            if (in.nextInt() == 2)
                break;

        }

    }

}
