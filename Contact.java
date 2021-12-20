package com.example.javachallenge2;

import java.util.ArrayList;

public class Contact {
    private String name;
    private String email;
    private int number;
    private ArrayList messages;


    public Contact(String name, String email, int number, ArrayList messages) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.messages = messages;
    }

    public Contact(String name, String email, int number) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.messages = new ArrayList<>();
    }

    public void getContactDetails(){
        System.out.println("Contact name: " + contact +
        "\nEmail: " + email +
        "\nNumber: " + number);
    }
    
    public String showContacts(){
        return("Name: " + getName() + "\nNumber: " + getNumber());
    } 

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
