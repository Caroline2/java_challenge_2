package com.example.javachallenge2;

import java.util.Scanner;

public class Main {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Hi! What is your name?");
        String name = sc.nextLine();

        Messenger mess = new Messenger(name);
        mess.greet();
}
}
