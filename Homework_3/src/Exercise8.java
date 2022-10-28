public class Exercise8 {

    public static void main(String[] args) {

        int tempNumberOfEquipment;
        int counterUnluckyNumber = 0;

        for (int numberOfEquipment = 1; numberOfEquipment <=99999; numberOfEquipment++){

            tempNumberOfEquipment = numberOfEquipment;

            while(tempNumberOfEquipment > 0){

                if (tempNumberOfEquipment % 10 == 4 || tempNumberOfEquipment % 100 == 13){
                    counterUnluckyNumber++;
                    break;
                }

                tempNumberOfEquipment /= 10;

            }

        }

        System.out.println("Придеться исключить " + counterUnluckyNumber + " номеров!");

    }

}
