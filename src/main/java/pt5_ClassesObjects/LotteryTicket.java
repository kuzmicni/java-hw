package pt5_ClassesObjects;

import java.util.Random;

public class LotteryTicket {


    int[] arr = new int[]{1,2,3,4,5,6};


    public int[] generateTicket(){

        Random random = new Random();
        for (int i =0; i<6; i++){
            this.arr[i] = random.nextInt(69);
        }

        return  this.arr;
    }


}
