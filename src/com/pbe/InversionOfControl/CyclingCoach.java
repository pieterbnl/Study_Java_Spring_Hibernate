package com.pbe.InversionOfControl;

public class CyclingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Start with 1 hour medium intensity cycling, then 30 minutes 90 sec sprints with 30 sec breaks.";
    }
}