package com.pbe.AnnotationDemo;

import org.springframework.stereotype.Component;

// Spring will automatically register this bean with the Spring container, and use the bean id "thatOneCoach"
// This allows the bean to be retrieved alter from the container, using that bean id
// Not specifying a bean-id. Spring will create a default one,
// which is the class name, with first character lower case. I.e.: cyclingCoach
@Component
public class MTBCoach implements AnotherCoach {

    @Override
    public String getDailyWorkout() {
        return "Practice your sprinting capabilites";
    }
}