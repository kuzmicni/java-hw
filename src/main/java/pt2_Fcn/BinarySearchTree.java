package pt2_Fcn;

import java.util.Arrays;

public class BinarySearchTree {
    /*
    First need to arrange array.
    Do search by dividing array into halves.
    */


    public static void main(String[] args) {

        int[] myArr = new int[]{1, 4, 56, 21, 44};
        int myLuckyNum = 21;
        Arrays.sort(myArr);
        int a = Arrays.binarySearch(myArr, myLuckyNum);
        System.out.println(a);
    }


}
