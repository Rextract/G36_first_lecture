package org.example;

//For - each example
// Used when iterating through an array or collection
// Do not have a counter like the other for loop
// Instead of the counter you declare a variable
// with the same type as the elements of the Array/Collection, followed by a colon and then the Array/Collection name
//You use your declared variable to access each element in the loop.

public class ForExample {
    public static void main(String[] args) {
        int [] numbers = {11,4,5,6,1,88,4,22,5,43,77,11,3,35,71,754};

        int max = 0;
        for (int number : numbers) {
            if(number > max)
                max = number;

        }
        System.out.println("Highest number is " + max);
    }
}
