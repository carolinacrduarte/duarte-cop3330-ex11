/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        double c_from;
        double rate;
        Scanner scan = new Scanner(System.in); //Double scanner.
        System.out.print("How many euros are you exchanging? ");
        c_from = scan.nextDouble();
        System.out.print("What is the exchange rate? ");
        rate = scan.nextDouble();

        //Currency conversion calculation:
        double c_to = c_from * rate;

        //Rounding up to two decimal places:
        double roundOff = Math.round(c_to * 100.0) / 100.0;

        //Printing:
        System.out.println(c_from + " euros at an exchange rate of " + rate + " is: " + "\r\n" + roundOff + " U.S. dollars.");

    }
}
