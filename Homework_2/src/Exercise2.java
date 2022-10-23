import java.util.Scanner;

public class Exercise2 {

    public static void main(String args[]){

        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int day = 0, month = 0, year = 0;
        Scanner in = new Scanner(System.in);

        while(true) {

            System.out.print("День: ");
            day = in.nextInt();
            System.out.print("Месяц: ");
            month = in.nextInt();
            System.out.print("Год: ");
            year = in.nextInt();

            if ((year % 4 == 0 && year % 100 != 0)
                    || (year % 100 == 0 && year % 400 == 0)) {
                daysInMonth[2] = 29;
            }

            if (month >= 1 && month <= 12) {

                if (day >= 1 && day <= daysInMonth[month]) {

                    day++;

                    if (day > daysInMonth[month]) {

                        day = 1;
                        month++;

                        if (month > 12) {
                            month = 1;
                            year++;
                        }

                    }

                    System.out.println("Дата следующего дня: " + day + "." + month + "." + year);

                } else {
                    System.out.println("Введенной даты не существует!");
                }

            } else {
                System.out.println("Введенной даты не существует!");
            }

            daysInMonth[2] = 28;

            System.out.print("Хотите продолжить? (1 - Да / 2 - Нет): ");
            if (in.nextInt() == 2)
                break;

        }

    }

}
