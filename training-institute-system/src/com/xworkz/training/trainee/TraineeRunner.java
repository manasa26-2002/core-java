package com.xworkz.training.trainee;

import com.xworkz.training.institute.Institute;

public class TraineeRunner {
    public static void main(String[] args) {

        Trainee t1 = new Trainee();
        t1.setId(1);
        t1.setName("asha");
        t1.setDob("12/11/2002");
        t1.setEmail("asha56@gmail.com");
        t1.setPhoneNumber("8874312190");
        t1.setGender(Gender.female);
        t1.setDegreeName("Bachelor Of Engineering");
        t1.setYearOfGraduation("2024");
        t1.setPlaced(false);


        Institute i1 = new Institute();
        i1.addTrainee(t1);

        Trainee t2 = new Trainee();
        t2.setId(2);
        t2.setName("abhay");
        t2.setEmail("abhay45@gmail.com");
        t2.setDob("23/09/2001");
        t2.setPhoneNumber("7790623156");
        t2.setGender(Gender.male);
        t2.setDegreeName("Bachelor of Engineering");
        t2.setYearOfGraduation("2023");
        t2.setPlaced(true);

        i1.addTrainee(t2);
        i1.getAllTrainee();

        i1.getName("abhay");
        i1.getNameById(2);

        i1.getNameByGender(Gender.female);

        i1.getPhoneNumberByName("asha");

        i1.getEmailById(1);

        i1.getEmailByName("abhay");

        i1.getDobById(1);

        i1.getDegreeNameByName("asha");

        i1.getYearOfGraduationByDegreeName("Bachelor of Engineering");

        boolean emailIdUpdated = i1.updateEmailById("asha45@gmail.com",1);
        System.out.println("email updated");
        i1.getAllTrainee();

       boolean phoneNumberUpdated = i1.updatePhoneNumberByName("abhay","9980756431");
        System.out.println("phone number updated");
        i1.getAllTrainee();

        boolean isPlacedUpdated = i1.updateIsPlacedByName("asha",true);
        System.out.println("isPlaced updated");
        i1.getAllTrainee();

        i1.deleteTraineeById(2);
      i1.getAllTrainee();
    }
}
