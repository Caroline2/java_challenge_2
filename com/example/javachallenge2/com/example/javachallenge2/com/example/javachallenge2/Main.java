package com.example.javachallenge2;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Hi! What is your name?");
        String name = System.console().readLine();

        Messenger mess = new Messenger(name);
        mess.greet();
}
}
