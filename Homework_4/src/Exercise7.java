import java.util.Random;
import java.util.Arrays;

public class Exercise7 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] sourceArray = new int[20];
        int sizeResultArray = 1;

        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = random.nextInt(10);
        }

        System.out.println("Исходный массив: " + Arrays.toString(sourceArray));

        Arrays.sort(sourceArray);

        for (int i = 1; i < sourceArray.length; i++) {
            if (sourceArray[i - 1] != sourceArray[i]){
                sizeResultArray++;
            }
        }

        int[] resultArray = new int[sizeResultArray];

        int counterIndexResultArray = 1;
        resultArray[0] = sourceArray[0];

        for (int i = 1; i < sourceArray.length; i++) {
            if (sourceArray[i - 1] != sourceArray[i]) {
                resultArray[counterIndexResultArray++] = sourceArray[i];
            }
        }

        System.out.println("Результирующий массив: " + Arrays.toString(resultArray));

    }

}
