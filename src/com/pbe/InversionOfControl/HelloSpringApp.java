package com.pbe.InversionOfControl;


import org.springframework.context.support.ClassPathXmlApplicationContext;

// Spring application
public class HelloSpringApp {

    public static void main(String[] args) {

        // Load Spring configuration file, which is used to configure the beans
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from Spring container
        // Note that Coach is the name of the interface that's implemented
        // When passing the interface to the method, Spring will cast the object

        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach2 = context.getBean("myCoach2", Coach.class);

        // Call method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach2.getDailyWorkout());

        // Close the context (=container) after use
        // This will release any resources and locks that its implementation might hold
        // It will also destroy all the cached singleton beans
        context.close();
    }
}