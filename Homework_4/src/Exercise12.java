import java.util.Random;
import java.util.Arrays;

public class Exercise12 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] sourceArray = new int[11];

        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = random.nextInt(10);
        }

        System.out.println("Исходный массив: " + Arrays.toString(sourceArray));

        int tempArrayElement;

        for (int i = 0; i < sourceArray.length / 2; i++) {

            tempArrayElement = sourceArray[i];
            sourceArray[i] = sourceArray[sourceArray.length - i - 1];
            sourceArray[sourceArray.length - i - 1] = tempArrayElement;

        }

        System.out.println("Перевернутый массив: " + Arrays.toString(sourceArray));

    }

}
