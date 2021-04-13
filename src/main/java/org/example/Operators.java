package org.example;

//Operator = very common operator that assigns the value of right hand operator to the left
//Arithmetic Operators = + - * /
//"Changing" a primitive = in order to change a primitive you need to do this
//int number = 5;       number = number + 1;
// double decimal = 432.43;       decimal = decimal - (234.32 / 32);
//increment(++) and decrement (--) operators example int number 0; (space) number ++;
// its the same as int number = 0; (space) number = number + 1; same thing with decrement (--)


// Comparison Operators (==, !=, <, >, <=, >=)
//needed to evaluate if some condition is true or false
//Equality operator == is used to check if two primitives are equal
// Next we are using != which will be true if two primitives are not equal


import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {

        //int number = 1923;

        //number = (number / 23);
        //System.out.println(number);

        //int integer = 0;
        //System.out.println(integer++); //add this after evaluation (added late) prints before increments it
       //System.out.println(integer);  //it does actually increment it

        //Modulus (%) or the "Remainer operator"
        //Since 11 is not evenly divided by 3 we have a modulus value of 2
        //Since modulus is 9%3 is 0, the "remainder" is 2. (9 + 2 = 11)
        //int modulus = 11 % 3;
        //System.out.println(modulus);

        //boolean statements true or false?
        int number1 = 10, number2 = 11;
        System.out.println(number1 < number2); //true
        System.out.println(number1 > number2); //false
        System.out.println(10 < 10); //false
        System.out.println(10 <= 10); //true
        System.out.println(12 % 3 > 0); // false

        //boolean statements
        int i1=10;
        int i2=11;

        System.out.println(i1 < i2);
    }//Main method ends here

}//public class ends here