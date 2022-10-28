import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long elementSequence = 1L;
        int sizeSequence = 0;
        int controller;

        System.out.print("Введите размер последовательности: ");

        do {
            controller = 0;
            try{
                sizeSequence = scanner.nextInt();
            } catch(Exception e) {
                System.out.print("Некорректный ввод данных, попробуйте еще раз: ");
                scanner.nextLine();
                controller = -1;
            }
        } while(controller == -1);

        System.out.print("Последовательность чисел: ");

        for (int i = 1; i <= sizeSequence; i++) {
            System.out.print(elementSequence + " ");
            elementSequence *= 2L;
        }

    }

}
