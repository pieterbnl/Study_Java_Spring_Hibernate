package com.pbe.SpringHibernate;

public class BaseballCoach implements Coach {

    // Defining fortuneservice field
    private FortuneService fortuneService;

    // Constructor - assigning fortuneService field
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // Use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

}