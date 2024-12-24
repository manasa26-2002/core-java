package com.xworkz.treat.hospital;

public class PatientRunner {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.setPatientId(23);
        p1.setPatientName("akshay");
        p1.setDoctorName("Dr.Anshu");
        p1.setDisease("typhoid");
        p1.setPatientBill(10876.34);

        Hospital hospital = new Hospital();
        hospital.addPatient(p1);

        Patient p2 = new Patient();
        p2.setPatientId(3);
        p2.setPatientName("monika");
        p2.setDoctorName("Dr.Prakash");
        p2.setDisease("malaria");
        p2.setPatientBill(13765.12);



        hospital.addPatient(p2);
        //hospital.getAllPatient();
//        hospital.getPatientById(1);

        boolean patientNameUpdated = hospital.updatePatientNameById("amith",23);


        hospital.getAllPatient();
        hospital.deletePtientByName(3);
        hospital.getAllPatient();
    }
}
