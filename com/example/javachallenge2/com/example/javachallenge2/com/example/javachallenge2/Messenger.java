package com.example.javachallenge2;

import java.util.ArrayList;

public class Messenger {
    
    private String owner;
    public static ArrayList<Contact> contacts = new ArrayList<>();
    public static ArrayList<Message> messages = new ArrayList<>();

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
            System.out.println("\nWhich action do You want to proceed?");

            System.out.println("1. Manage contacts");
            System.out.println("2. Messages");
            System.out.println("3. Quit");

            String valid = System.console().readLine();
            System.out.println("You chose "+ valid + "!\n");
            chosen = check(valid);

        }while(chosen == 1);
    }

    public int check(String valid){
        int chosen = 1;

        switch (valid){
            case "1": chosen = 0;
                manageContacts();
                break;
            case "2": chosen = 0;
                messages();
                break;
            case "3": chosen = 0;
                quit();
                break;
            default: chosen = 1;            
        }
        return chosen;
    }

    public void manageContacts(){
        int result = 0;

        do{
            System.out.println("\nWhich action do You want to proceed?");

            System.out.println("1. Show all contacts");
            System.out.println("2. Add a new contact");
            System.out.println("3. Search a contact");
            System.out.println("4. Delete a contact");
            System.out.println("5. Go back to the previous menu");

            String contactsAction = System.console().readLine();
            System.out.println("You chose "+ contactsAction + "!\n");
            result = checkContact(contactsAction);

        }while(result == 1);
    }

    public int checkContact(String contactsAction){
        int chosen = 1;

        switch (contactsAction){
            case "1": chosen = 0;
                showContacts();
                break;
            case "2": chosen = 0;
                addContact();
                break;
            case "3": chosen = 0;
                searchContact();
                break;
            case "4": chosen = 0;
                deleteContact();
                break;
            case "5": chosen = 0;
                goBack();
                break;
            default: chosen = 1;            
        }
        return chosen;
    }

    public void addContact(){
        System.out.println("What is the name of the new contact?");
        String name = System.console().readLine();
        System.out.println("What is the email of " + name + "?");
        String email = System.console().readLine();
        System.out.println("What is the number of " + name + "? Don't forget the phone preselection.");
        String number = System.console().readLine();

        if (duplicateContact(name) == false){
            Contact newContact = new Contact(name, email, number);
            contacts.add(newContact);

            System.out.println("Added new contact:");
            newContact.getContactDetails();
            manageContacts();
        }
        else {
            System.out.println("You already have a contact with the name " + name + "!");
            manageContacts();
        }
    }

    public boolean duplicateContact(String name){
        for (Contact c: contacts){
            if (c.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public void showContacts(){
        if (contacts.size() == 0){
            System.out.println("You saved no contacts yet.");
        }
        else{
            for (int i = 0; i < contacts.size(); i++){
                System.out.println("\n" + (i + 1) + ". Contact:");
                contacts.get(i).getContactDetails();
            }
        }
        manageContacts();
    }
    
    public void searchContact(){
        System.out.println("Which contact do you want to search? Enter the name.");
        String name = System.console().readLine();
        Contact searchedContact;

        for (int j = 0; j < contacts.size(); j++){

            if (name.equals(contacts.get(j).getName())) {

                searchedContact = contacts.get(j);
                searchedContact.getContactDetails();
                name = "";
                manageContacts();
            }
        }
        if (!name.equals("")){
            System.out.println("You do not have a contact with the name " + name + "!");
            manageContacts();
        }

    }


    public void deleteContact(){
        System.out.println("Which contact do you want to delete? Enter the name.");
        String name = System.console().readLine();
        Contact deleteContact;

        for (int k = 0; k < contacts.size(); k++){
            if (name.equals(contacts.get(k).getName())) {
                deleteContact = contacts.get(k);

                System.out.println("Do you really want to delete this contact? (type YES if so)");
                deleteContact.getContactDetails();

                String confirmation = System.console().readLine();

                if (confirmation.equals("YES")){
                    contacts.remove(contacts.get(k));
                    System.out.println("The contact with the name " + name + " was deleted.");
                }
                else{
                    System.out.println("The contact with the name " + name + " wasn't deleted.");
                }
                manageContacts();
            }
            else{
                System.out.println("You do not have a contact with the name " + name + "!");
                manageContacts();
            }
        }

    }

    public void messages(){
        int sure = 0;
        do{
            System.out.println("\nWhich action do You want to proceed?");

            System.out.println("1. See the list of all messages");
            System.out.println("2. Send a new message");
            System.out.println("3. Go back to the previous menu");

            String messagesAction = System.console().readLine();
            System.out.println("You chose "+ messagesAction + "!\n");
            sure = checkMessage(messagesAction);

        }while(sure == 1);
    }

    public int checkMessage(String messagesAction){
        int chosen = 1;

        switch (messagesAction){
            case "1": chosen = 0;
                showMessages();
                break;
            case "2": chosen = 0;
                newMessage();
                break;
            case "3": chosen = 0;
                goBack();
                break;
            default: chosen = 1;            
        }
        return chosen;
    }

    public void showMessages(){
        if (messages.size() == 0){
            System.out.println("You haven't sent any messages yet.");
        }
        else{
            for (int i = 0; i < messages.size(); i++){
                System.out.println("\n" + (i + 1) + ". Message:");
                messages.get(i).getMessageDetails();
            }
        }
        messages();
    }

    public void newMessage(){
        System.out.println("Who is the receiver of your message?");
        String receiver = System.console().readLine();
        String text;
        Contact receiverContact;
        Message newMessage;
        ArrayList<Message> receiverMessages;

        if (contacts.size() != 0){
            for (int k = 0; k < contacts.size(); k++){
                if (receiver.equals(contacts.get(k).getName())) {
                    receiverContact = contacts.get(k);

                    System.out.println("What are you going to say, what is your message?");
                    text = System.console().readLine();

                    newMessage = new Message(receiver, text);

                    messages.add(newMessage);

                    receiverMessages = receiverContact.getMessages();
                    receiverMessages.add(newMessage);
                    receiverContact.setMessages(receiverMessages);

                    System.out.println("The message to " + receiver + " was sent!");
                    messages();
                }
                else{
                    System.out.println("You do not have a contact with the name " + receiver + "!");
                    messages();
                }
            }
        }
        else{
            System.out.println("You do not have any contact yet so you can't send any messages.");
            manageContacts();
        }

    }

    public void quit(){
        System.out.println("Thanks for using the app.\n" +
        "See ya next time with a new contact list!");
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
