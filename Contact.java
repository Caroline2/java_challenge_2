/**
 *  TODO:   private Array List for Messages --> no, just print all of them in a loop
 */


package com.example.javachallenge2;

public class Contact {

    private String name;
    private int number;


    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
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
