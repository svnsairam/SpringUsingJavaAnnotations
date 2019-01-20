package com.seleniumexpress.tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//  @Component("beanNameCollege")
// We can use @Bean inside the @Configuration class to create Beans
// Instead of using @Component annotation to create beans for Class.
public class College {

    // If we use @Autowired for variable
    // we must not use the setter method.
    // So either use @Autowired for setter methods
    // Or use @Autowired for variables

    @Autowired
    private Principle principle;


    // Teacher is an Interface.
    // Since we have 2 classes Science and Math Teachers
    // So we use @Qualified and specify the Bean id to be used
    // If we don't specify the @Qualified
    // The system checks if there is any bean as @Primary
    @Autowired
    @Qualifier("myScienceTeacherBean")
    private Teacher teacher;

//    We are done with constructor Injection
//    Now we delete the constructor in College class
//    And we do the setter Injection.
//
//    public College(Principle principle) {
//        this.principle = principle;
//    }

//    @Autowired
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
//    @Autowired
//    public void setPrinciple(Principle principle) {
//        this.principle = principle;
//    }

    public void tellSomething() {
        System.out.println("telling something means Hi!... Good Morning");
        principle.principleInfo();
        teacher.teach();
    }
}
