package pt5_ClassesObjects;

public class LotteryTicketTest {

    public static void main(String[] args) {

        LotteryTicket myLuckyTicket = new LotteryTicket();
        myLuckyTicket.generateTicket();
        System.out.println(myLuckyTicket.arr[5]);
    }
}
