package com.example.javachallenge2;

public class Message {
    private String receiver;
    private String text;
    private int id;

    public Message(String receiver, String text, int id) {
        this.receiver = receiver;
        this.text = text;
        this.id = id;
    }

    public void getMessageDetails() {
        System.out.println("Receiver name: " + receiver +
        "\nMessage: " + text +
        "\nMessage ID: " + id);
        
    }

    /**
     * @return String return the receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * @param receiver the receiver to set
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * @return String return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return String return the id
     */
    public String getid() {
        return id;
    }

    /**
     * @param text the id to set
     */
    public void setid(int id) {
        this.id = id;
    }

}
