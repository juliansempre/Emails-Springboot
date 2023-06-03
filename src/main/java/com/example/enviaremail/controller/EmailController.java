package com.example.enviaremail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private JavaMailSender emailSender;

    @GetMapping("/enviar-email")
    public String enviarEmail(@RequestParam("nome") String nome,
                              @RequestParam("email") String email,
                              @RequestParam("destino") String destino,
                              @RequestParam("mensagem") String mensagem) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(destino);
            message.setSubject("Novo email do formulário");
            message.setText("Nome: " + nome + "\nEmail: " + email + "\nMensagem: " + mensagem);
            emailSender.send(message);
            return "<script>" +
                    "alert('Email enviado com sucesso!');" +
                    " window.location.href = '/';" +
                    "</script>";
        } catch (MailException e) {
            return "<script>" +
                    "alert('Erro ao enviar o email: " + e.getMessage() + "');" +
                    " window.location.href = '/';" +
                    "</script>";
        }
    }

}
