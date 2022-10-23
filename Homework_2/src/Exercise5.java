import java.util.Scanner;

public class Exercise5 {

    public static void main(String args[]){

        double a, b, c;
        double discriminant;
        Scanner in = new Scanner(System.in);

        while(true) {

            System.out.println("Для уравнения ax^2 + bx + c = 0");
            System.out.print("Введите а: ");
            a = in.nextDouble();
            System.out.print("Введите b: ");
            b = in.nextDouble();
            System.out.print("Введите с: ");
            c = in.nextDouble();

            if (a != 0) {

                if (c == 0 && b == 0){
                    System.out.println("Неполное квадратное уравнение: ax^2");
                    System.out.println("x = 0");
                } else if (c == 0){
                    System.out.println("Неполное квадратное уравнение: ax^2 + bx = 0");
                    System.out.println("x1 = 0");
                    System.out.println("x2 = " + (-b/a));
                } else if (b == 0){
                    System.out.println("Неполное кввадратное уравнение: ax^2 + c");
                    if (-c / a < 0){
                        System.out.println("Корней нет, т.к. с/a = " + -c / a + " < 0");
                    }
                    else {
                        System.out.println("x1 = " + (-Math.sqrt(-c/a)));
                        System.out.println("x2 = " + (Math.sqrt(-c/a)));
                    }
                } else {

                    System.out.println("Полное квадратное уравнение");

                    discriminant = Math.pow(b, 2) - 4 * a * c;

                    if (discriminant > 0) {
                        System.out.println("x1 = " + ((-b + Math.sqrt(discriminant)) / (2 * a)));
                        System.out.println("x2 = " + ((-b - Math.sqrt(discriminant)) / (2 * a)));
                    } else if (discriminant == 0) {
                        System.out.println("x = " + ((-b) / (2 * a)));
                    } else {
                        System.out.println("Корней нет, т.к. D = " + discriminant + " < 0)");
                    }

                }
            } else {

                System.out.println("Линейное уравнение bx + c = 0");
                System.out.println("x = " + (-c/b));

            }

            System.out.print("Хотите продолжить? (1 - Да / 2 - Нет): ");
            if (in.nextInt() == 2)
                break;

        }

    }

}