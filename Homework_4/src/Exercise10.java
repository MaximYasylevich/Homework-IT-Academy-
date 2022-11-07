import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int sizeRows;
        int sizeColumns;

        System.out.print("Введите кол-во строк матрицы: ");
        sizeRows = scanner.nextInt();

        System.out.print("Введите кол-во столбцов матрицы: ");
        sizeColumns = scanner.nextInt();

        int[][] sourceMatrix = new int[sizeRows][sizeColumns];

        System.out.println("Полученная матрица: ");

        int maxSum = 0, sum;
        int indexMaxSum = 0;

        for (int i = 0; i < sizeRows; i++) {

            sum = 0;

            for (int j = 0; j < sizeColumns; j++) {

                sourceMatrix[i][j] = random.nextInt(20) + (-10);
                System.out.printf("%4d", sourceMatrix[i][j]);

                sum += sourceMatrix[i][j];

            }

            System.out.printf("%6s = %d", "(sum)", sum);

            if (i == 0) {
                maxSum = sum;
            } else if (maxSum < sum) {
                maxSum = sum;
                indexMaxSum = i;
            }

            System.out.println();

        }

        System.out.println("Номер строки с максимальной суммой эллементов: " + (indexMaxSum + 1));

    }

}