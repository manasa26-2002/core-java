package com.xworkz.training.trainee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trainee {

    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private String dob;
    private String yearOfGraduation;
    private String degreeName;
    private boolean isPlaced;
}
