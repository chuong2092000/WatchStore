package com.example.asmfinal.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MailInfo {
    String from;
    String to;
    String [] cc;
    String [] bcc;
    String subject;
    String body;
    String [] attachments;
    public MailInfo(String to, String subject, String body) {
        this.from="FPT@poly";
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
}
