package com.vinod.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("person2methodCall")   );
        System.out.println(context.getBean("person3parameters")   );
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person5Qulifier")   );

        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
