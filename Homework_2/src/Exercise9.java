import java.util.Scanner;

public class Exercise9 {

    public static void main(String args[]) {

        int numberOfTheDay;
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.print("Введите номер дня недели: ");
            numberOfTheDay = in.nextInt();

            switch (numberOfTheDay) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Дня с таким номером не существует!");
                    break;
            }

            System.out.print("Хотите продолжить? (1 - Да / 2 - Нет): ");
            if (in.nextInt() == 2)
                break;

        }

    }

}
