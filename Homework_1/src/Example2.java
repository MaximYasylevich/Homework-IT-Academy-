public class Example2 {

    public static void main(String args[]){

        int number = 1337;
        int firstHalfOfTheNumber;
        int secondHalfOfTheNumber;
        int sum;

        firstHalfOfTheNumber = number / 100;
        secondHalfOfTheNumber = number % 100;
        sum = firstHalfOfTheNumber + secondHalfOfTheNumber;

        System.out.println("Число abcd: " + number);
        System.out.println("Число ab: " + firstHalfOfTheNumber);
        System.out.println("Число dc: " + secondHalfOfTheNumber);
        System.out.println("ab + dc = " + sum);

    }

}
