package com.seleniumexpress.tutorials;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
// The components scan is used to scan the base packages if there are any @Component classes.
// If there are no @Components defined we can remove the @ComponentScan
@ComponentScan(basePackages = "com.seleniumexpress.tutorials")
public class CollegeConfig {

/*
We are done with constructor Injection
Now we delete the constructor in College class
And we do the setter Injection.

   @Bean(name={"name1","name2"})
    // If there are no name in @Bean annotation method name(i.e nyCollegeBean) acts as bean id.
    public College myCollegeBean() {
        College college = new College(myprincipleBean());
        return college;
    }
*/

    @Bean(name={"name1","name2"})
    // If there are no name in @Bean annotation method name(i.e nyCollegeBean) acts as bean id.
    public College myCollegeBean() {
        College college = new College();
        return college;
    }

    @Bean
    public Principle myprincipleBean(){
       Principle principle = new Principle();
       return principle;
    }
    @Bean
    public Teacher myScienceTeacherBean(){
        Teacher teacher = new ScienceTeacher();
        return teacher;
    }
    @Bean
    @Primary
    public Teacher myMathTeacherBean(){
        Teacher teacher = new MathTeacher();
        return teacher;
    }




}
