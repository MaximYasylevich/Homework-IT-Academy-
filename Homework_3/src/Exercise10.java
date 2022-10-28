public class Exercise10 {

    public static void main(String[] args) {

        int counterInvalidPlate = 0;
        int tempPlateNumber;

        for(int plateNumber = 1; plateNumber <= 50000; plateNumber++){

            tempPlateNumber = plateNumber;

            while(tempPlateNumber > 0){

                if (tempPlateNumber % 10 == 2){
                    counterInvalidPlate++;
                    break;
                }

                tempPlateNumber /= 10;

            }

        }

        System.out.println("Ошибочных табличек оказалось: " + counterInvalidPlate);

    }

}
