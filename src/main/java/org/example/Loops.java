package org.example;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {     // Application starts

        Scanner scanner = new Scanner(System.in); // Used for taking user input from console
        //(Instantiating a Scanner object)
        boolean isAdult = true;  // Boolean controlling the loop

        while(isAdult)
        System.out.println("How old are you?"); //Prints out a String
        int age = scanner.nextInt(); // Stores input from scanner in int age

        if (age >= 18) {   // Checks if age is 18 or above
            System.out.println("You are an adult"); //if true it will print a message
        } else { //if age is under 18
            System.out.println("You are a child"); //if false prints another message
            isAdult = false; // iterate until isAdult is false
        }

        }

    } //Application terminates


