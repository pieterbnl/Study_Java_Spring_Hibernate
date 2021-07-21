package com.pbe.SpringHibernate;

public class CricketCoach implements Coach {

    // Helper class dependency
    private FortuneService fortuneService;

    // CricketCoach specific fields
    private String emailAddress;
    private String team;

    // No-arg constructor (will be called by Spring when making a reference to this bean)
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    // Getters
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    // Setters
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method setTeam");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}