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
    

    @PostMapping("/contact")
    public String submitForm(ContactForm form) {
        contactRepository.saveContact(form);
        
    }
    return "redirect:/thank-you.html";
}
