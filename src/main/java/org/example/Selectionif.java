package org.example;

// If statements - often we want our code to branch.
// example: int age = 20;
//          if(age >= 18) {
//          System.out.println("You can have a beer")

//if we want to print that someone is below 18
//example: int age = 17;
//         if(age >= 18) {
//           System.out.println("You can have a beer");
//         } else {
//                System.out.println("You are too young to drink beer");

//Selection SWITCH statement
//Decision making structure
//Single value is evaluated and redirected to first matching CASE
// if no matching case is found an optional "default case" is called
//Supported evaluation types are = byte, short, char, int, String and enum (enumerated) values


import java.util.Scanner;

public class Selectionif {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How old are you? ");

//If - else if statements
//to have more than two branches you can use this technique

        int age = Integer.parseInt(SCANNER.nextLine());

        if(age > 0) {

            if (age > 17) {
                System.out.println("You are an adult");
            } else if (age > 12 && age < 18) {
                System.out.println("You are a teenager");
            } else if (age < 13 && age > 3) {
                System.out.println("You are a kid");
            } else {
                System.out.println("You are a baby");
            }
        }else {
            System.out.println("You are not even born");
        }

    }

}
