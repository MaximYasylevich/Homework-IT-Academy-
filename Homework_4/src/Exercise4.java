import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int sizeArray;

        System.out.print("Введите размер массива: ");
        sizeArray = scanner.nextInt();

        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(11) + (-5);
        }

        int maxIndex = 0;

        for (int i = 2; i < array.length; i += 2) {

            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }

        }

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Максимальный элемент с четным индексом: " + array[maxIndex]);

    }

}
