import java.util.Scanner;

public class Exercise6 {

    public static void main(String args[]){

        double circumferenceLength;
        double circleCenterX1, circleCenterY1;
        double pointX1, pointY1;
        Scanner in = new Scanner(System.in);

        while(true) {

            System.out.println("Введите координаты центра круга");
            System.out.print("X1: ");
            circleCenterX1 = in.nextDouble();
            System.out.print("Y1: ");
            circleCenterY1 = in.nextDouble();

            System.out.print("Введите длину окружности круга: ");
            circumferenceLength = in.nextInt();

            System.out.println("Введите координаты интересующей точки");
            System.out.print("X1: ");
            pointX1 = in.nextDouble();
            System.out.print("Y1: ");
            pointY1 = in.nextDouble();

            if (circumferenceLength / Math.PI / 2
                    >= Math.sqrt(Math.pow(pointX1 - circleCenterX1, 2) + Math.pow(pointY1 - circleCenterY1, 2))) {
                System.out.println("Точка пренадлежит кругу!");
            } else {
                System.out.println("Точка НЕ пренадлежит кругу!");
            }

            System.out.print("Хотите продолжить? (1 - Да / 2 - Нет): ");
            if (in.nextInt() == 2)
                break;

        }

    }

}
