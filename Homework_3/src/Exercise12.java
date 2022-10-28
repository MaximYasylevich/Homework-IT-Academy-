public class Exercise12 {

    public static void main(String[] args) {

        int counterOfSymmetricCombination = 0;

        for (int hours = 100; hours <= 123; hours++) {

            for (int minutes = 100; minutes <= 159; minutes++) {

                if ((minutes % 10 == (hours / 10) % 10) && (hours % 10 == (minutes / 10) % 10)) {
                    counterOfSymmetricCombination++;
                }

            }

        }

        System.out.println("Кол-во симметричных комбинаций: " + counterOfSymmetricCombination);

    }

}
