package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

class AssignmentWeek1_Calculator {
    public static final Scanner scanner = new Scanner(System.in);

    public static double divide (double one, double two){
        return one / two;
    }

    public static double multiply (double one, double two){
        return one * two;
    }

    public static double subtract (double one, double two){
        return one - two;
    }

    public static double add (double one, double two){
        return one + two;
    }


    public static void main(String[] args) {

        boolean isCalculate = true;



        while (isCalculate) {
            System.out.println("Do you want to calculate? y/n ");

            char Calculate = scanner.next().charAt(0);

            if (Calculate == 'y') {
                System.out.println("Lets calculate!");


                char operators;
                double number1, number2, result;

                Scanner scanner = new Scanner(System.in);

                System.out.println("Insert first number: ");
                number1 = scanner.nextDouble();

                System.out.println("Choose which operator you want to use (+, -, * or /)");
                operators = scanner.next().charAt(0);

                System.out.println("Insert second number: ");
                number2 = scanner.nextDouble();

                switch (operators) {

                    case '+':
                        result = add(number1, number2);
                        System.out.println(number1 + " + " + number2 + " = " + result);
                        break;

                    case '-':
                        result = subtract(number1, number2);
                        System.out.println(number1 + " - " + number2 + " = " + result);
                        break;

                    case '*':
                        result = multiply(number1, number2);
                        System.out.println(number1 + " * " + number2 + " = " + result);
                        break;

                    case '/':
                        result = divide(number1, number2);
                        System.out.println(number1 + " / " + number2 + " = " + result);
                        break;
                    default:
                        System.out.println("You didn't choose a valid operator ");
                        break;

                }

            } else {
                System.out.println("See you next time!");
                boolean IsCalculate = false;
                break;

            }

        }

    }

}





