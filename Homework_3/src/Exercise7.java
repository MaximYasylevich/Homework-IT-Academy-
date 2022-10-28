public class Exercise7 {

    public static void main(String[] args) {

        long previousElement = 0;
        long currentElement = 1;
        long nextElement;

        System.out.print("Ряд Фибоначчи: " + previousElement + " " + currentElement);

        for (int i = 0; i < 9; i++) {

            nextElement = previousElement + currentElement;
            System.out.print(" " + nextElement);
            previousElement = currentElement;
            currentElement = nextElement;

        }

    }

}
