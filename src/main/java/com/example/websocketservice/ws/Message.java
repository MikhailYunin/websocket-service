package com.example.websocketservice.ws;

public class Message {

    private String author;
    private String messageText;

    public Message() {
    }

    public Message(String from, String text) {
        this.author = from;
        this.messageText = text;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

}