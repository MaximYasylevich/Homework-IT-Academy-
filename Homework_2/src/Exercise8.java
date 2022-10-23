import java.util.Scanner;

public class Exercise8 {

    public static void main(String args[]){

        int fingerNumber;
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.print("Введите номер пальца: ");
            fingerNumber = in.nextInt();

            switch (fingerNumber) {
                case 1:
                    System.out.println("Мизинец");
                    break;
                case 2:
                    System.out.println("Безымянный");
                    break;
                case 3:
                    System.out.println("Средний");
                    break;
                case 4:
                    System.out.println("Указательный");
                    break;
                case 5:
                    System.out.println("Большой");
                    break;
                default:
                    System.out.println("Такого пальца не существует!");
                    break;
            }

            System.out.print("Хотите продолжить? (1 - Да / 2 - Нет): ");
            if (in.nextInt() == 2)
                break;

        }
    }

}
