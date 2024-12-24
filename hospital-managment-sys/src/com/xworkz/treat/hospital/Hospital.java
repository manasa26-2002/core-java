package com.xworkz.treat.hospital;

import java.util.Arrays;

public class Hospital {
 Patient patient[] = new Patient[2];
 int index;

 public boolean addPatient(Patient patient){
 boolean isAdded = false;
if(patient.getPatientId() >0 && patient.getPatientName() != null
      && patient.getDoctorName()!=null)
{
   this.patient[index] = patient;
   index++;
   isAdded = true;
}
return  isAdded;
 }
 public void getAllPatient(){
     for(Patient patien : this.patient){
         System.out.println("patient is" +patien.getPatientId() + " " +"name" +patien.getPatientName()
         + " " +"doctor name:" +patien.getDoctorName());
     }
 }
   public Patient getPatientById(int id){
   Patient patientToBeReturned = null;
   for(Patient patient : patient){
   if(patient.getPatientId()==id)
       patientToBeReturned = patient;
   }
   return patientToBeReturned;
   }
     public boolean updatePatientNameById(String updatName,int id){
      boolean ispatientNameUpdated = false;
      for(Patient patient :patient){
          if(patient.getPatientId()==id){
              patient.setPatientName(updatName);
              ispatientNameUpdated = true;
          }
      }
      return ispatientNameUpdated;
     }

     public boolean deletePtientByName(int id){
     boolean isPatientDeleted = false;
     int a = 0;
     for(int i=0; i<this.patient.length; i++){
        Patient patient = this.patient[i];
       if(patient.getPatientId()==id){
           this.patient[i]=this.patient[i];
           i++;
       }
       else{
           isPatientDeleted = true;
       }
     }
      int size = a;
      patient = Arrays.copyOf(this.patient,size);
      return isPatientDeleted;

     }
}
