package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = scanner.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizza = scanner.nextInt();
        System.out.print("How many slices per pizza? ");
        int slicePerPizza = scanner.nextInt();

        //Calculations
        int slices = slicePerPizza * pizza;
        System.out.println(people + " people with " + pizza + " pizzas (" + slices + " slices)");
        int personPizza = slices / people;
        int leftovers = slices % people;

        //Handles Output
        if(slices % 2 != 0) {
            System.out.println("You do not have an even number of slices");
            System.exit(0);
        }
        System.out.println("Each person gets " + personPizza + " pieces of pizza.");
        System.out.println("There are " + leftovers + " leftover pieces.");
    }
}
