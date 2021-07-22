package com.pbe.SpringHibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // Load Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve beans from Spring container
        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // Call methods on bean
        boolean result = (myCoach== alphaCoach);

        // Display results
        System.out.println("\n Pointing to the same object: " + result);

        System.out.println("\n Memory location for myCoach: " + myCoach);

        System.out.println("\n Memory location for alphaCoach: " + alphaCoach + "\n");

        // Close context
        context.close();
    }

}