package com.xworkz.training.institute;

import com.xworkz.training.trainee.Gender;
import com.xworkz.training.trainee.Trainee;

import java.util.Arrays;

public class Institute {

    Trainee trainee[] = new Trainee[2];
    int index;

    public boolean addTrainee(Trainee trainee) {
        //boolean isAdded = false;
        if (trainee.getId() > 0 && trainee.getName() != null
                && trainee.getEmail() != null && trainee.getPhoneNumber() != null
                && trainee.getGender() != null && trainee.getDegreeName() != null
                && trainee.getYearOfGraduation() != null) {
            this.trainee[index++] = trainee;
           // isAdded = true;
        }
        return false;
    }

    public void getAllTrainee() {
        System.out.println("list of trainee");
        for (Trainee trainee : trainee)
            System.out.println("id" + trainee.getId() + " " + "name" + trainee.getName() + " "
                    + "email" + trainee.getEmail() + " " + "phonenumber" + trainee.getPhoneNumber() + " "
                    + "gender" + trainee.getGender() + " " + "degree" + trainee.getDegreeName() + " "
                    + "year of graduation" + trainee.getYearOfGraduation());
    }
       public  String getName(String name){
        String n1  = null;
           System.out.println("inside get name");
            for(Trainee trainee : trainee){
                if(trainee.getName()==name)
                    name=trainee.getName();
                System.out.println("name is:"+trainee.getName());
            }
            return name;
       }
    public Trainee getNameById(int id) {
        Trainee traineeToBeReturned = null;
        System.out.println("inside get name by id");
        for (Trainee trainee : trainee) {
            if (trainee.getId() == id)
                traineeToBeReturned = trainee;
            //System.out.println("name is:"+);
        }
        return traineeToBeReturned;
    }

    public String getNameByGender(Gender gender) {
        String name = null;
        System.out.println("inside getNameByGender");
        for (Trainee trainee : trainee) {
            if (trainee.getGender()==gender) {
                name = trainee.getName();
                //System.out.println("name:"+trainee.getName());
                System.out.println("gender:" + trainee.getGender());
            }
        }
        System.out.println("end of get name by gender");
        return name;
    }

    public String getPhoneNumberByName(String name) {
        String phoneNumber = null;
       // System.out.println("inside get number by name");
        for (Trainee trainee : trainee) {
            if (trainee.getName() == name)
                phoneNumber = trainee.getPhoneNumber();
            System.out.println("phoneNumer"+trainee.getPhoneNumber());
        }
        //System.out.println("end of getPhoneNumberByName");
        return phoneNumber;
    }

    public String getEmailByName(String name) {
        String email = null;
        //System.out.println("inside getEmailByName");
        for (Trainee trainee : trainee) {
            if (trainee.getName() == name)
                email = trainee.getEmail();
            System.out.println("email:"+trainee.getEmail());
        }
        //System.out.println("end of getEmailByName");
        return email;
    }

    public String getEmailById(int id) {
        String email = null;
        //System.out.println("inside getEmailById");
        for (Trainee trainee : trainee) {
            if (trainee.getId() == id)
                email = trainee.getEmail();
            System.out.println("email:"+trainee.getEmail());
        }
        //System.out.println("end of getEmailById");
        return email;
    }

    public String getDobById(int id) {
        String dob = null;
       // System.out.println("inside getDobById");
        for (Trainee trainee : trainee) {
            if (trainee.getId() == id)
                dob = trainee.getDob();
            System.out.println("dob:"+trainee.getDob());
        }
        //System.out.println("end of getDobById");
        return dob;
    }

    public String getDegreeNameByName(String name) {
        String degreeName = null;
        //System.out.println("inside getDegreeNmaeById");
        for (Trainee trainee : trainee) {
            if (name != null && trainee.getName() == name)
                degreeName = trainee.getDegreeName();
            System.out.println("degree name:"+trainee.getDegreeName());
        }
        //System.out.println("end of getDegreeNmaeByName");
        return degreeName;
    }

    public String getYearOfGraduationByDegreeName(String degreeName) {
        String yearOfGraduation = null;
        //System.out.println("inside getYaerOfGraduationByDegreeName");
        for (Trainee trainee : trainee) {
            if (trainee.getDegreeName() == degreeName)
                yearOfGraduation = trainee.getYearOfGraduation();
            System.out.println("year of graduation:"+trainee.getYearOfGraduation());
        }
        //System.out.println("end of getYearOfGraduationByDegreeName");
        return yearOfGraduation;
    }

    public boolean updateEmailById(String updateEmail, int id) {
        boolean isEmailUpdated = false;
        for (Trainee trainee : trainee) {
            if (trainee.getId() == id) {
                trainee.setEmail(updateEmail);
                isEmailUpdated = true;
            }
        }
        if (isEmailUpdated = false)
            System.out.println(id + " is not found");
        return isEmailUpdated;
    }

    public boolean updatePhoneNumberByName(String name, String updatePhoneNumber) {
        boolean isPhoneNumberUpdated = false;
        for (Trainee trainee : trainee) {
            if (trainee.getName() == name) {
                trainee.setPhoneNumber(updatePhoneNumber);
                isPhoneNumberUpdated = true;
            }
        }
        return isPhoneNumberUpdated;
    }

    public boolean updateIsPlacedByName(String name, boolean updateIsPlaced) {
        boolean isPlaced = false;
        for (Trainee trainee : trainee) {
            if (trainee.getName() == name) {
                trainee.setPlaced(updateIsPlaced);
                isPlaced = true;
            }
        }
        return isPlaced;
    }

       public boolean deleteTraineeById(int id){
        boolean isTraineeDeleted = false;
        int i = 0;
        for(int a=0; a<this.trainee.length; a++){
            Trainee trainee = this.trainee[a];
            if(trainee.getId()==id){
                this.trainee[a] = this.trainee[a];
            }
            else{
                isTraineeDeleted = true;
            }
        }
        int size = i;
        trainee = Arrays.copyOf(this.trainee , size);
        return isTraineeDeleted;
       }
}







