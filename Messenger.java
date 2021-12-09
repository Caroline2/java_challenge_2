package com.example.javachallenge2;

import java.util.Scanner;

public class Messenger {
    private String owner;

    public static Scanner sc = new Scanner(System.in);

    public Messenger(String owner) {
        this.owner = owner;
    }

    public void greet(){
        System.out.println("Welcome to Your messenger, " + getOwner() + "!");
        dropDownList();
    }

    public void dropDownList(){
        int chosen = 0;

        do{
            System.out.println("Which action do You want to proceed?");

            System.out.println("1. Manage contacts");
            System.out.println("2. Messages");
            System.out.println("3. Quit");

            char valid = sc.next().charAt(0);
            System.out.println("You chose "+ valid + "!");
            chosen = check(valid);

        }while(chosen == 1);
    }

    public int check(char valid){
        int chosen = 1;

        switch (valid){
            case '1': chosen = 0;
                manageContacts();
                break;
            case '2': chosen = 0;
                messages();
                break;
            case '3': chosen = 0;
                quit();
                break;
            default: chosen = 1;            
        }
        return chosen;
    }

    public void manageContacts(){
        System.out.println("1. Show all contacts");
        System.out.println("2. Add a new contact");
        System.out.println("3. Search a contact");
        System.out.println("4. Delete a contact");
        System.out.println("5. Go back to the previous menu");
    }

    public void messages(){
        System.out.println("1. See the list of all messages");
        System.out.println("2. Send a new message");
        System.out.println("3. Go back to the previous menu");
    }

    public void quit(){
        System.out.println("Thanks for using the app. \nSee ya next time!");
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
