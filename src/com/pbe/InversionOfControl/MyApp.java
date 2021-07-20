package com.pbe.InversionOfControl;

public class MyApp {

    public static void main(String[] args) {

        // Create an Coach object
        Coach baseballcoach = new BaseballCoach();
        Coach trackcoach = new TrackCoach();

        // Display the coach's daily workout
        System.out.println(baseballcoach.getDailyWorkout());
        System.out.println(trackcoach.getDailyWorkout());
    }

}