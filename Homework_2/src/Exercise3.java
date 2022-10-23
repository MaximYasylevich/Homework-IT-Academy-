import java.util.Scanner;

public class Exercise3 {

    public static void main(String args[]){

        int numberOfSeconds;
        int numberOfHours;

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.print("Введите кол-во секунд до конца рабочего дня[0; 28800]: ");
            numberOfSeconds = in.nextInt();

            if (numberOfSeconds >= 0 && numberOfSeconds <= 28800) {

                numberOfHours = numberOfSeconds / 3600;

                if (numberOfSeconds == 0) {
                    System.out.println("Конец рабочего дня!");
                } else if (numberOfHours == 0 && numberOfSeconds % 3600 > 0) {
                    System.out.println("Осталось менее часа, девочки!");
                } else if (numberOfHours == 1) {
                    System.out.println("Остался 1 час");
                } else if (numberOfHours >= 2 && numberOfHours <= 4) {
                    System.out.println("Остолось " + numberOfHours + "часа");
                } else if (numberOfHours == 8) {
                    System.out.println("Начало рабочего дня, девочки!");
                } else {
                    System.out.println("Осталось " + numberOfHours + " часов");
                }

            } else {
                System.out.println("Данное число не входит в диапазон [0; 28800]!");
            }

            System.out.print("Хотите продолжить? (1 - Да / 2 - Нет): ");
            if (in.nextInt() == 2)
                break;

        }

    }

}
