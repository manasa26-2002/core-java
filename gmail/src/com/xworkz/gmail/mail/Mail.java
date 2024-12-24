package com.xworkz.gmail.mail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mail {

    private String to;
    private String from;
    private String subject;
    private String body;
    private String description;

}
