public class Example3 {

    public static void main(String args[]){

        int number = 76513;
        int thirdDigitOfTheNumber;

        thirdDigitOfTheNumber = (number / 100) % 10;

        System.out.println("Третья цифра числа " + number + ": " + thirdDigitOfTheNumber);

    }

}
