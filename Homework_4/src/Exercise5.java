import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int sizeArray;

        System.out.print("Введите кол-во элементов массива: ");
        sizeArray = scanner.nextInt();

        int[] sourceArray = new int [sizeArray];

        for (int i = 0; i < sourceArray.length; i++) {

            sourceArray[i] = random.nextInt(10) + (-4);

        }

        int minIndex = 1;

        for (int i = 1; i < sourceArray.length; i += 2) {

            if (sourceArray[minIndex] > sourceArray[i]) {
                minIndex = i;
            }

        }

        System.out.println("Исходный массив: " + Arrays.toString(sourceArray));
        System.out.println("Минимальный из эллементов массива с нечетным индексом: " + sourceArray[minIndex]);

    }

}