package org.example;

import java.util.Scanner;

public class ExerciseWeek1_6 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        double number1;
        System.out.println("Please insert first number: ");
        number1 = scanner.nextInt();

        double number2;
        System.out.println("Please insert second number: ");
        number2 = scanner.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        //System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));



    }
}
