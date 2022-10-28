public class Exercise9 {

    public static void main(String[] args) {

        int tempTicketNumber;
        int counterLuckyTickets = 0;

        int sumFirstHalf;
        int sumSecondHalf;

        for (int ticketNumber = 1000001; ticketNumber <= 1999999; ticketNumber++){

            tempTicketNumber = ticketNumber;

            sumFirstHalf = 0;
            sumSecondHalf = 0;

           for (int i = 0; i < 6; i++){

                if (i < 3){
                    sumSecondHalf += tempTicketNumber % 10;
                } else {
                    sumFirstHalf += tempTicketNumber % 10;
                }

                tempTicketNumber /= 10;

           }

           if (sumFirstHalf == sumSecondHalf){
               counterLuckyTickets++;
           }

        }

        System.out.println("Кол-во счастливых билетов: " + counterLuckyTickets);

    }

}