package com.mayur.MM_Portfolio.repository;

import com.mayur.MM_Portfolio.entity.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveContact(ContactForm form) {
        String sql = "INSERT INTO contact_form (name, email, phone, service, preferred_date, message) VALUES (?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
            form.getName(),
            form.getEmail(),
            form.getPhone(),
            form.getService(),
            form.getDate(),
            form.getMessage()
        );
    }
}
