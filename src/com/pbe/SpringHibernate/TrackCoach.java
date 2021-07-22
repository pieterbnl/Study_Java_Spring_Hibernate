package com.pbe.SpringHibernate;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a slow 10k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // Init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside doMyStartupStuff");
    }

    // Destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside doMyCleanupStuff");
    }

}