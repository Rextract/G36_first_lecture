package org.example;

import java.util.Scanner;

//Switch example:    double num1= 5, num2 = 7, result = 0;
//                   char operator = '+';
//char operator is evaluated <------- switch(operator) {
//                                    case '+':
//                                      result = num1 + num2;
//                                        break;
//                                    case '-':
//                                      result = num1 - num2;
//                                        break;
// cases(operators+-*/)<------------- case '*':
//                                      result = num1 * num2;
//                                        break;
//                                    case '/':
//                                      result = num1 / num2;
//Break statements in all cases<----- break;
//to get out of the switch            default: ----------->Default statement will trigger if no matching case is found
//                                    System.out.println(operator + "is not supported");
//                                    }
//                                    System.out.println(result);
public class SwitchExample {
    
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char c = scanner.nextLine().charAt(0);

        final char selection1 = '1';
        final char selection2 = '2';
        final char selection3 = '3';

        switch (c){

            case selection1 :
                System.out.println("You enter menu selection " + selection1);
                break;
            case selection2:
                System.out.println("You entered menu selection " + selection2);
                break;
            case selection3:
                System.out.println("You entered selection " + selection3);
                break;
            default:
                System.out.println("Terminating program...");
        }


    }
}
