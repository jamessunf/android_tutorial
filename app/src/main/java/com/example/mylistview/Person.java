package com.example.mylistview;

public class Person {
    private String name;
    private String massage;

    public Person(String name, String massage) {
        this.name = name;
        this.massage = massage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
