package org.example;

// class Person {            Create object of Person like this
//                           Also known as INSTANTIATE an object
// Person = Type
// Erik = object name
// (=) is the assignment operator
// new Person (); = Call to constructor

// Create object of Person like this
// Also known as INSTANTIATE an object    <>    Next we assign VALUES to our object
// String firstname; <------------------------- erik.firstname = "Erik";
// String lastname; <-------------------------- erik.lastname = "Svensson";
// int age;  <--------------------------------- erik.age = 42;
// String hobby; <----------------------------- erik.hobby = "programming";
//and always end with }

//Now we create a method that return a String describing our object
//class person {
// String firstName;
// String lastname;
// int age;
// String hobby;
// public String getInformation()  {
//    return firstName + " " + lastname + " is " + age + " years old and likes " + hobby;
//    }
// }

//This is how to print out variables and Strings in the console
//introduction to primitive variables in Java
// how to use a variety of operators in Java
//Make SELECTIONS with if and Switch statements
// learned the basics about Java Strings
// learned how to create a simple Class
//Object instantiation from a Class


import org.example.model.Student;

public class ClassAndObject {

    public static void main(String[] args) {

        String name = "Abraham Aguilera Mahamoud";

        String role = "Student ";

        String groupName = "Java ";
        int groupNumber = 36;

        Student Abraham = new Student();
        Abraham.setName(name);
        Abraham.setGroup(groupName);
        Abraham.setRole(role);
        Abraham.setGroupNumber(groupNumber);

        System.out.println(Abraham.getInfo());

        ClassAndObject classAndObject = new ClassAndObject();

        System.out.println(classAndObject);

        classAndObject.print("hello");

        Student David = new Student();
        David.setName("David Aguilera Mahamoud ");
        David.setGroup("Java ");
        David.setRole("Student ");
        David.setGroupNumber("36 ");

        String info = David.getInfo();
        System.out.println(David.getInfo());
        System.out.println(Abraham.getInfo());
    }

    public void print(String s){
        System.out.println(s);
    }


}
