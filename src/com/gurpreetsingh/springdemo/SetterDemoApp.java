package com.gurpreetsingh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from the spring container
        CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call the methods
        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getDailyFortune());

        // call our new methods to get the literal values (emailaddress, team)
        System.out.println(myCoach.getEmailAddress());

        System.out.println(myCoach.getTeam());

        // close the context
        context.close();

    }
}
