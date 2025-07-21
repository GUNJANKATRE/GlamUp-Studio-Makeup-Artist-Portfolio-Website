package com.mayur.MM_Portfolio.controller;

import com.mayur.MM_Portfolio.entity.ContactForm;
import com.mayur.MM_Portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public String submitContact(@RequestBody ContactForm form) {
        int result = contactRepository.saveContact(form);
        return result == 1 ? "Message submitted successfully!" : "Failed to submit message.";
    }
}
