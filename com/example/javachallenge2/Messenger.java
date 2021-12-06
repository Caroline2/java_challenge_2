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
                break;
            case '2': chosen = 0;
                break;
            case '3': chosen = 0;
                break;
            default: chosen = 1;            
        }
        return chosen;
    }

    public void chosenAction(){
        
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
