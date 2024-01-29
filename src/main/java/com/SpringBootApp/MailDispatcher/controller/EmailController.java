package com.SpringBootApp.MailDispatcher.controller;
import com.SpringBootApp.MailDispatcher.model.EmailRequest;
import com.SpringBootApp.MailDispatcher.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Value("${spring.mail.username}")
    private String user;

    @Value("${spring.mail.password}")
    private String pass;
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmails")
    public String sendEmails(@RequestBody EmailRequest request) {
        emailService.sendEmails(request.getToEmails(), request.getSubject(), request.getText());
        return "Emails sent successfully";
    }

    @GetMapping("/senderinfo")
    public String senderInfo() {
        return ("Email will send via: "+ user + " and Account password is: " + pass);
    }
}




