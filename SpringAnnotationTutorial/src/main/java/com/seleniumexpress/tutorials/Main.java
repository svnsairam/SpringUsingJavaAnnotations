package com.seleniumexpress.tutorials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CollegeConfig.class);
    // myCollegeBean - is a bean id;
    College college = applicationContext.getBean("name2",College.class);
    System.out.println("The college object created by spring in IOC is : "+college);
    college.tellSomething();

    }
}
