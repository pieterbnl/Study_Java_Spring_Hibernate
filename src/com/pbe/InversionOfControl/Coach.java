package com.pbe.InversionOfControl;

// Interface, to be supported by all type of coaches
public interface Coach {

    // Enforcing each coach requires to specify a daily workout
    // Note: remember interface has no implementation code, only a specification (-> what is available, not how)
    public String getDailyWorkout();

}