package com.example.task1;

public class Mail {
    String content ;
    String info ;

    public Mail() {
    }

    public Mail(String content, String info) {
        this.content = content;
        this.info = info;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
