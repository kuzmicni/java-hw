package pt1_HelloWorld;

import java.util.Scanner;

public class TipCalculator {
    /*
    Calculate tip based on bill amount.
     */

    public static void main(String[] args) {
        System.out.println("Enter bill amount:");
        Scanner scanner = new Scanner(System.in);
        double billAmt = scanner.nextDouble();

        System.out.println(String.format("Tip amount: %s", billAmt*0.15));
    }
}
