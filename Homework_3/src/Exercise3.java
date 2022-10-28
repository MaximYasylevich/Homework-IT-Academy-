import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sizePyramid = 0;
        int controller;

        System.out.print("Введите размер пирамиды: ");

        do {
            controller = 0;
            try{
                sizePyramid = scanner.nextInt();
            } catch(Exception e) {
                System.out.print("Некорректный ввод данных, попробуйте еще раз: ");
                scanner.nextLine();
                controller = -1;
            }
        } while(controller == -1);

        for (int i = 1; i <= sizePyramid; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
