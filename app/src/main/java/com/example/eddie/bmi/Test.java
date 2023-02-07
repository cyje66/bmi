package com.example.eddie.bmi;

import com.example.eddie.bmi.test.Person;

public class Test {
    public static void main(String[] args) {

        Person p = new Person();
        p.setHeight(1.7f);
        p.setWeight(70.0f);
        System.out.println(p.bmi(p.getHeight(), p.getWeight()));
    }
}
