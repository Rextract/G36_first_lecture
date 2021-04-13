package org.example;
//A static method
//public = Visible to everyone everywhere for within the system and inside the system
// static = it belongs to the class and not an object to the class
// Void = the returntype (special returntype) what is this method going to produce (doesnt produce any method)
// main = method

// 8 different datatypes in JAVA: Byte, short, int, long, float, double, boolean, char
//its used to store data in memory, what type they can store depends on the datatype
// Byte = -128 is the minimum ammount value and max value 127 = 8 bit
//short = -32768 is the minimum and max is 32767 = 16 bit
// Int = -2147483648 is the minimum and max is 2147483647 = 32 bit
// long = -9223372036854775808 is the minimum and max is 9223372036854775807 = 64 bit

// float and double are decimal numbers and is written with a dot (.)
// Float is 32 bit and double 64 bit.
// double is the default choice for decimals. we use this whenever we need a number

// data type boolean.
// has only two values: True or False.
// Used for evaluate if some condition has status true or false

//Data type char is a 16 bit unicode character
// min value of /u0000 or INT representation of 0
//max value of /uffff or int representation of 65535

//To create primitive variables = data type > int   and   name = speed     and set speed is 100


import java.sql.SQLOutput;

public class App
{

    public static void main(String[] args)
    {
        System.out.println("Hello David!");

        //example of a primitive variables

        byte b = -127;
        short s = 24465;
        int i = 27;
        long l = 3242095820L;


        float f = 345.65F;
        double d = 3424254.4543235;

        char c = '1';
        boolean bool = true;

        b = (byte) s;
        System.out.println(b);

        // the datatypes that can hold each other and no one can hold a "bool"
        s = b; //OK because short are bigger than bytes
        i = s; //OK because ints are bigger than shorts
        l = i; //OK because Long are bigger than int

        f = i; //OK because int and float are both 32bit
        d = l; //OK because double and long are both 64bit

        //cant assign example long to an int without "casting"

    }//Main method ends here


}// App.class ends here



//Operator = very common operator that assigns the value of right hand operator to the left
//Arithmetic Operators = + - * /
//"Changing" a primitive = in order to change a primitive you need to do this
//int number = 5;       number = number + 1;
// double decimal = 432.43;       decimal = decimal - (234.32 / 32);

