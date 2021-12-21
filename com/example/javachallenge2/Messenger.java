package com.example.javachallenge2;

import java.util.ArrayList;
import java.util.Scanner;


public class Messenger {
    
    private String owner;
    public static ArrayList<Contact> contacts = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public Messenger(String owner) {
        this.owner = owner;
    }

    public void greet(){
        System.out.println("Welcome to Your messenger, " + getOwner() + "!");
        dropDownList();
    }

    public void goBack(){
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
        int result = 0;

        do{
            System.out.println("Which action do You want to proceed?");

            System.out.println("1. Show all contacts");
            System.out.println("2. Add a new contact");
            System.out.println("3. Search a contact");
            System.out.println("4. Delete a contact");
            System.out.println("5. Go back to the previous menu");

            char contactsAction = sc.next().charAt(0);
            System.out.println("You chose "+ contactsAction + "!");
            result = checkContact(contactsAction);

        }while(result == 1);
    }

    public int checkContact(char contactsAction){
        int chosen = 1;

        switch (contactsAction){
            case '1': chosen = 0;
                showContacts();
                break;
            case '2': chosen = 0;
                addContact("Lojza", "lojza@gmail.com", 123456789);
                break;
            case '3': chosen = 0;
                searchContact();
                break;
            case '4': chosen = 0;
                deleteContact();
                break;
            case '5': chosen = 0;
                goBack();
                break;
            default: chosen = 1;            
        }
        return chosen;
    }

    public void addContact(String name, String email, int number){
        Contact newContact = new Contact(name, email, number);
        newContact.getContactDetails();
    }
    
    public void showContacts(){
        System.out.println("Contacts");
    }
    
    public void searchContact(){

    }

    public void deleteContact(){

    }

    public void messages(){
        int sure = 0;
        do{
            System.out.println("Which action do You want to proceed?");

            System.out.println("1. See the list of all messages");
            System.out.println("2. Send a new message");
            System.out.println("3. Go back to the previous menu");

            char messagesAction = sc.next().charAt(0);
            System.out.println("You chose "+ messagesAction + "!");
            sure = checkMessage(messagesAction);

        }while(sure == 1);
    }

    public int checkMessage(char messagesAction){
        int chosen = 1;

        switch (messagesAction){
            case '1': chosen = 0;
                showMessages();
                break;
            case '2': chosen = 0;
                newMessage();
                break;
            case '3': chosen = 0;
                goBack();
                break;
            default: chosen = 1;            
        }
        return chosen;
    }

    public void showMessages(){

    }

    public void newMessage(){

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
