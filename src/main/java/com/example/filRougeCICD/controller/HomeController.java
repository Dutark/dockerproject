package com.example.filRougeCICD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class HomeController {

    @GetMapping("/")
    public Object getInfo() {
        String name = "Votre nom";
        String email = "votreMail@campus-eni.fr";
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        return new Response(name, email, date);
    }

    public static class Response {
        private String name;
        private String email;
        private String date;

        public Response(String name, String email, String date) {
            this.name = name;
            this.email = email;
            this.date = date;
        }

        // Getters et Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
}

