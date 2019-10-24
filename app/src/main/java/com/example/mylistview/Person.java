package com.example.mylistview;

public class Person {
    private String name;
    private boolean send;
    private String massage;

    public Person(String name, boolean send, String massage) {
        this.name = name;
        this.send = send;
        this.massage = massage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
