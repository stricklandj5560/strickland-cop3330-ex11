import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            double euros, exchangeRate, total = 0;
            System.out.print("How many euros are you exchanging? ");
            euros = scan.nextDouble();
            System.out.print("What is the exchange rate? ");
            exchangeRate = scan.nextDouble();
            total = euros * exchangeRate;
            System.out.println(
                    String.format("%s euros at an exhancge rate of %s is\n%s U.S. dollars.",
                                    euros,
                                    exchangeRate,
                                    (double) Math.round(100 * total) / 100));
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
