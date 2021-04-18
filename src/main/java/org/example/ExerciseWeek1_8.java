package org.example;

import java.util.Scanner;

public class ExerciseWeek1_8 {
    public static void main(String[] args) {

        int hiddenNumber;
        hiddenNumber = (int) (Math.random() * 99 + 1);
        //System.out.println("The hidden number is " + hiddenNumber);

        Scanner scanner = new Scanner(System.in);
        int count = 1;


        int guess;

        do {
        System.out.print("Guess the right number from 1 to 100: ");
        guess = scanner.nextInt();
        //System.out.println("Your guess is " + guess);

        if (guess < hiddenNumber)
        System.out.println("Your guess was too small, try again ");
        else if (guess > hiddenNumber)
        System.out.println("Your guess was too big, please try again " );
        else if (guess == hiddenNumber)
            System.out.println("Congratulations! You guessed the right number! Good job! You guessed " + count + " times ");

            count++;

        }while (guess != hiddenNumber);







    }

}
