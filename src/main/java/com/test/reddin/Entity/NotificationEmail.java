package com.test.reddin.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "n_email")

public class NotificationEmail {
    private String subject;
    private String recipient;
    private String body;
}
