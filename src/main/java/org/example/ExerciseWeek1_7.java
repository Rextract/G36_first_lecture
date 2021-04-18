package org.example;

public class ExerciseWeek1_7 {
    public static void main(String[] args) {

        int timeSeconds = 86399;
        int hours = timeSeconds / 3600;
        int remaining = timeSeconds % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
