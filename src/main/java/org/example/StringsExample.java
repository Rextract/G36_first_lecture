package org.example;
//Java Strings often refered to as the ninth primitive
// Its NOT a primitive. All Strings are always objects
// Its often treated as primitives
//Its a sequence of characters
//Take notice of the captial 'S' in "String"

//example:
// String myName = "David A.M";
//         System.out.println(myName);
// A String is immutable meaning it cannot change or they DONT change

//example:
// String name = "David"; -----> Declaring the String and assigning value
//         name.concat("A.M");    -----> Adding "A.M" to the name String by calling the String method concat
//         System.out.println(name); -----> what will this print out? Answer: only the name "David"
//                                          Because whenever you try to modify a String it gives you a new String
//Example 1:
// String name = "David";
//           name = name.concat ("A.M");
//           System.out.println(name); ------> it will print out both first and lastname
//
//          and its the same as following:
//Example 2:
//           String name = "David";
//           name = name + (" A.M");
//           System.out.println(name)


//Building Strings:
//  String firstName = "David";
//  String lastname = " Aguilera Mahamoud";
//  int age = 27;
//  String hobby = "Create music";
//  String sentence = firstname + lastname + "is" + age + "years old and likes" + hobby;
//  System.out.println(sentence);


public class StringsExample {
    public static void main(String[] args) {
        String name = "David Aguilera Mahamoud";
        String sentence = name + " is a musician and a pianist";

        System.out.println(sentence);


        String name2 = "Abraham";
        name2 = name2.concat(" A.M");
        String sentence2 = name2 + " is also an musician but plays guitar";

        System.out.println(sentence2);


       String name3 = "Ahmed";
       name3 = name3.concat(" A.M");
       String sentence3 = name3 + " is Davids and Abrahams big brother";

       System.out.println(sentence3);

       String name4 = " Erika ";
       name4 = name4 + ("Sandberg ");
       int age = 31;
       String hobby = " Davids Housewife and to be there for him ";

        System.out.println(name4 + "is " + age + " and is" + hobby);

        String name5 = " Miyaray";
        name5 = name5 + (" Aguilera ");
        int age2 = 38;
        String hobby2 = " she is a singer ";
        System.out.println(name5 + "is " + age2 + " and" + hobby2);

        String name6 = " Evelinn";
        name6 = name6.concat (" Ynghagen");
        int age3 = 13;
        String hobby3 = " likes to watch streams on twitch";
        String sentence4 = name6 + " is " + age3 + " and" + hobby3;
        System.out.println(sentence4);
    }
}
