package com.vinod.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address add) {}
record Address(String name, int address){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "VInod";
    }

    @Bean
    public int age(){
        return 10;
    }
    @Bean
    public String Organization(){
        return "UCM";
    }


    @Bean
    public Person person(){
        var person = new Person("Vinod", 18,new Address("Olathe", 1800));

        return person;
    }

    @Bean
    public Person person2methodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }
    @Bean
    @Primary
    public Person person4primary(String name, int age, Address address3){
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Vinod353", 13450);
    }

    @Bean
    public Person person5Qulifier(String name, int age, @Qualifier("address3Qualifier") Address address){
        return new Person(name, age, address);
    }

    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    public Address address3(){
        return new Address("Vinod", 10);
    }

}
