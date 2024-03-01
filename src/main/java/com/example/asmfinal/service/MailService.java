package com.example.asmfinal.service;

import com.example.asmfinal.entity.MailInfo;
import jakarta.mail.MessagingException;

public interface MailService {
    int send(MailInfo mailInfo) throws MessagingException;
    void send(String to,String subject,String body) throws MessagingException;
}
