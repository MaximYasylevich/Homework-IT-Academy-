import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rowsSize;
        int columnsSize;

        System.out.println("Введите кол-во строк матрицы: ");
        rowsSize = scanner.nextInt();

        System.out.println("Введите кол-во столбцов матрицы: ");
        columnsSize = scanner.nextInt();

        int[][] matrix = new int[rowsSize][columnsSize];

        System.out.println("Исходная матрица: ");

        for (int i = 0; i < rowsSize; i++) {

            for (int j =0; j < columnsSize; j++) {

                matrix[i][j] = random.nextInt(10);
                System.out.printf("%3d", matrix[i][j]);

            }

            System.out.println();

        }

        System.out.println("Транспонированная матрица: ");

        int[][] transposedMatrix = new int[columnsSize][rowsSize];

        for (int i = 0; i < rowsSize; i++) {

            for (int j = 0; j < columnsSize; j++) {

                transposedMatrix[j][i] = matrix[i][j];

            }

        }

        for (int i = 0; i < columnsSize; i++) {

            for (int j = 0; j < rowsSize; j++) {

                System.out.printf("%3d", transposedMatrix[i][j]);

            }

            System.out.println();

        }

    }

}