/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        char chosen = scanner.next().toUpperCase().charAt(0);

        int temp,conversion;

        if(chosen == 'C') {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = scanner.nextInt();
            conversion = (temp - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is "+ conversion +".");
        }
        else if(chosen == 'F') {
            System.out.print("Please enter the temperature in Celsius: ");
            temp = scanner.nextInt();
            conversion = (temp * 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit is "+ conversion +".");
        }
        else {
            System.out.println("Please enter either C or F.");

        }

    }
}
