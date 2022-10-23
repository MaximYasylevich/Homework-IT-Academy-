import java.util.Scanner;

public class Exercise1 {

    public static void main(String args[]) {

        int totalNumberOfSecond = 0;
        int resultHour = 0, resultMinutes = 0, resultSeconds = 0, resultDays = 0, resultWeeks = 0;

        Scanner in = new Scanner(System.in);

        while (true){

            System.out.print("Введите общее кол-во секунд: ");
            totalNumberOfSecond = in.nextInt();

            if (totalNumberOfSecond > 0) {

                resultHour = totalNumberOfSecond / 3600;
                resultMinutes = (totalNumberOfSecond / 60) % 60;
                resultSeconds = totalNumberOfSecond % 60;

                System.out.print("Форматированный вид: ");

                if (resultHour > 0) {

                    if (resultHour % 10 == 1 && resultHour % 100 != 11) {
                        System.out.print(resultHour + " час ");
                    } else if ((resultHour % 10 >= 2 && resultHour % 10 <= 4)
                            && (resultHour % 100 < 12 || resultHour % 100 > 14)) {
                        System.out.print(resultHour + " часа ");
                    } else {
                        System.out.print(resultHour + " часов ");
                    }

                    resultWeeks = (totalNumberOfSecond / (3600 * 24)) / 7;
                    resultDays = (totalNumberOfSecond / (3600 * 24)) % 7;

                    if (resultHour / 24 > 0) {

                        System.out.print("(");

                        if (resultWeeks > 0) {
                            if (resultWeeks % 10 == 1 && resultWeeks % 100 != 11) {
                                System.out.print(resultWeeks + " неделя");
                            } else if ((resultWeeks % 10 >= 2 && resultWeeks % 10 <= 4)
                                    && (resultWeeks % 100 < 12 || resultWeeks % 100 > 14)) {
                                System.out.print(resultWeeks + " недели");
                            } else {
                                System.out.print(resultWeeks + " недель");
                            }
                        }

                        if (resultDays > 0) {
                            if (resultDays == 1) {
                                System.out.print((resultWeeks > 0 ? " " : "") + resultDays + " сутки");
                            } else {
                                System.out.print((resultWeeks > 0 ? " " : "") + resultDays + " суток");
                            }
                        }

                        resultHour = resultHour % 24;

                        if (resultHour > 0){
                            if (resultHour == 1 || resultHour == 21){
                                System.out.print((resultDays > 0 ? " " : "") + resultHour + " час");
                            } else if (resultHour >= 5 && resultHour <= 20){
                                System.out.print((resultDays > 0 ? " " : "") + resultHour + " часов");
                            } else {
                                System.out.print((resultDays > 0 ? " " : "") + resultHour + " часа");
                            }
                        }

                        System.out.print(") ");

                    }

                }

                if (resultMinutes > 0) {

                    if (resultMinutes % 10 == 1 && resultMinutes != 11) {
                        System.out.print(resultMinutes + " минута ");
                    } else if ((resultMinutes % 10 >= 2 && resultMinutes % 10 <= 4)
                            && (resultMinutes < 12 || resultMinutes > 14)) {
                        System.out.print(resultMinutes + " минуты ");
                    } else {
                        System.out.print(resultMinutes + " минут ");
                    }

                }

                if (resultSeconds > 0) {

                    if (resultSeconds % 10 == 1 && resultSeconds != 11) {
                        System.out.print(resultSeconds + " секунда ");
                    } else if ((resultSeconds % 10 >= 2 && resultSeconds % 10 <= 4)
                            && (resultSeconds < 12 || resultSeconds > 14)) {
                        System.out.print(resultSeconds + " секунды ");
                    } else {
                        System.out.print(resultSeconds + " секунд ");
                    }

                }

                System.out.print("\n");

            } else {
                System.out.println("Введите число > 0!");
            }

            System.out.print("Хотите продолжить? (1 - Да / 2 - Нет): ");
            if (in.nextInt() == 2)
                break;

        }

    }

}