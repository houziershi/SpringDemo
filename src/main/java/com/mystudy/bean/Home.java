package com.mystudy.bean;

public class Home {
    private Cat cat;
    private Dog dog;

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
