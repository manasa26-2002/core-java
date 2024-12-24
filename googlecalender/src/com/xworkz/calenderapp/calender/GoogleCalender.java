package com.xworkz.calenderapp.calender;

import com.xworkz.calenderapp.event.Event;
import com.xworkz.calenderapp.event.EventType;
import com.xworkz.calenderapp.exception.DescriptionNotFoundException;
import com.xworkz.calenderapp.exception.StartDateNotFoundException;
import com.xworkz.calenderapp.exception.WhoNotFoundException;

public class GoogleCalender implements Calender {

    Event event[] = null;
    public GoogleCalender (int size){
        event = new Event[size];
    }
   int index;

   @Override
    public boolean addEvent(Event events){
        boolean isAdded = false;
        if(events.getId()!=0 && events.getWho() !=null &&
                events.getDescription() != null &&
                events.getStartDate() != null && events.getEndDate() != null)
        {
            this.event[index++] = events;
            System.out.println("event added successfully");
            return true;
        }else{
            System.out.println("invalid event details.");
            return false;
        }
    }

    @Override
    public void getDetails() {
        System.out.println("event info");
        for(Event ref:event){
            if(ref != null){
                System.out.println(ref);
            }else{
                System.out.println("no availability");
            }
        }
    }

    @Override
    public Event getEventById(int id) {
        System.out.println("get event by id started");
        Event isFound = null;
        for(Event ref :event){
            if(ref != null && ref.getId() == id){
                System.out.println("event found");
                System.out.println("id:"+ref.getId());
                System.out.println("who:"+ref.getWho());
                System.out.println("description:"+ref.getDescription());
                System.out.println("start date:"+ref.getStartDate());
                System.out.println("end date:"+ref.getEndDate());
            }
        }
        System.out.println("get event by id ended");
        System.out.println("-----------------------------------");
        return  isFound;
    }

   public String getDescriptionByEventType(EventType eventType){
       
       System.out.println("get description by eventType is started");
       String description = null;
       try {
           for (Event event1 : event) {
               if (event1 != null && event1.getEventType() == eventType) {
                   description = event1.getDescription();
               }
           }
           System.out.println("get decription is ended");
       }catch (DescriptionNotFoundException d){
           d.printStackTrace();
       }
          return description;
   }

   public String getStartDateByEndDate(String endDate){
       System.out.println("getStartDate by endDate started");
       String startDate = null;
       try {
           for (Event event2 : event) {
               if (event2 != null && event2.getEndDate() == endDate) {
                   startDate = event2.getEndDate();
               }
           }
           System.out.println("get startDate  by endDate");
       }catch ( StartDateNotFoundException s){
           s.printStackTrace();
       }
      return startDate;
   }

   public String updateDescriptionByWho(String who){
       String description = null;
       try {
           for (Event event3 : event) {
               if (event3 != null && event3.getWho() == who) {
                   description = event3.getWho();
               }
           }
       }catch(WhoNotFoundException w){
           w.printStackTrace();
       }
       return description;
   }

   public
}