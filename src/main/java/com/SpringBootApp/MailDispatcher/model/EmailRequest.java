package com.SpringBootApp.MailDispatcher.model;
public class EmailRequest {

    private String[] toEmails;
    private String subject;
    private String text;

    // Add getters and setters
    public String[] getToEmails() {
        return toEmails;
    }

    public void setToEmails(String[] toEmails) {
        this.toEmails = toEmails;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

