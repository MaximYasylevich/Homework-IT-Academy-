import java.util.Scanner;
import java.util.Random;

public class Exercise13 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double arithmeticsMean;

        int matrixSize;

        System.out.print("Введите размер квадратной матрицы: ");
        matrixSize = scanner.nextInt();

        int[][] matrix = new int[matrixSize][matrixSize];

        System.out.println("Матрица: ");

        for (int i = 0; i < matrixSize; i++) {

            for (int j = 0; j < matrixSize; j++) {

                if (i == j || matrixSize - i - 1 == j) {

                    matrix[i][j] = 0;

                } else if ((j > i && j < matrixSize - i - 1) || (j < i && j > matrixSize - i - 1)) {

                    matrix[i][j] = random.nextInt(9) + 1;

                } else {

                    matrix[i][j] = random.nextInt(9) + (-9);

                }

                sum += matrix[i][j];

                System.out.printf("%3d", matrix[i][j]);

            }

            System.out.println();

        }

        arithmeticsMean = ((double) sum) / (matrixSize * matrixSize);

        System.out.println("Сумма всех элементов: " + sum);
        System.out.printf("Среднее арифметическое всех элементов %s %d: %.4f\n",
                (arithmeticsMean > sum ? "больше" : "меньше"), sum, arithmeticsMean);

    }

}
