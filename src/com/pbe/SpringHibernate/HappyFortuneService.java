package com.pbe.SpringHibernate;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.concurrent.ThreadLocalRandom;

public class HappyFortuneService implements FortuneService {

    public String getFortune() {

        // Set fortunes
        String[] fortunes = {
                "Today is your lucky day!",
                "I've failed over and over again in my life. And that is why I succeed.",
                "If you fail to prepare, you’re prepared to fail",
                "Never let your head hang down. Never give up and sit down and grieve. Find another way",
                "There may be people that have more talent than you but there’s no excuse for anyone to work harder than you do."
        };

        // Generate a random number ranging from 0 (first index of array) up to the max length of the fortunes array
        int randomNum = ThreadLocalRandom.current().nextInt(0, fortunes.length);
        String saying = fortunes[randomNum];
        return saying;
    }
}