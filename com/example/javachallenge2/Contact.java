package com.example.javachallenge2;

import java.util.ArrayList;

public class Contact {
    private String name;
    private String email;
    private String number;
    private ArrayList<Message> messages;


    public Contact(String name, String email, String number, ArrayList<Message> messages) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.setMessages(messages);
    }


    public Contact(String name, String email, String number) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.setMessages(new ArrayList<>());
    }

    public void getContactDetails(){
        System.out.println("Contact name: " + name + 
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

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
