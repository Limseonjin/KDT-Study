package com.spring.core;

import org.junit.jupiter.api.Test;

public class PersonTest {
    
    @Test
    void lombokTest(){
        Person person = new Person();

        person.setName("김철수");
        person.setAge(30);

        String name = person.getName();
        System.out.println("name = " + name);

        Person park = new Person("박영희", 35);
    }
    
}
