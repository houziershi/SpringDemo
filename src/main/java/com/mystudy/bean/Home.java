package com.mystudy.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Home {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    public Home() {
    }

    public Home(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void isWhat() {
        System.out.println("Home");
        cat.isWhat();
        dog.isWhat();
    }
}
