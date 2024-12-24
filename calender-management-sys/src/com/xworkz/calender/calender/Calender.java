package com.xworkz.calender.calender;

import com.xworkz.calender.event.Events;

public class Calender {
    Events event[] = new Events[3];
    int index;

    //Add Events
    public boolean addEvent(Events event){
        boolean isAdded = false;

        if(event.getEventId() > 0
                && event.getWho() != null
                && index < this.event.length)
        {
            this.event[index++] = event;
            isAdded = true;
            //System.out.println("Event added: " + isAdded);
        } else
        if(index >= this.event.length){
            System.out.println("Cannot add event: The calendar is full!!");
        }else
            System.out.println("Invalid event data!!");

        return isAdded;
    }


    public  void getAllEvents(){
        for (Events eve: event){
            if (eve != null)            {
                System.out.println("Event Id: " + eve.getEventId());
                System.out.println("Event by Who: " + eve.getWho());
                System.out.println("Event Start date: " + eve.getStartDate() );
                System.out.println("Event Start date: " + eve.getEndDate() );
                //System.out.println("Event Type: "+ eve.getEventType());
                System.out.println("Event Description: " + eve.getDescription());
               // System.out.println("All Day Event: " + eve.isAllDayEvent());
                System.out.println("--------------------------------------------");
            }
        }
    }


    public Events getEventById(int id){
        Events eventToBeReturned =null;
        for (Events eId: event){
            if (eId.getEventId() == id){
                eventToBeReturned = eId;

                System.out.println("Event Id: " + eId.getEventId());
                System.out.println("Event by Who: " + eId.getWho());
                System.out.println("Event Start date: " + eId.getStartDate() );
                System.out.println("Event Start date: " + eId.getEndDate() );
               // System.out.println("Event Type: "+ eId.getEventType());
                System.out.println("Event Description: " + eId.getDescription());
                //System.out.println("All Day Event: " + eId.isAllDayEvent());
                System.out.println("---------------------");
            }
        }
        if (eventToBeReturned == null){
            System.out.println("Given Event Id " + id + " not found");
        }
        return eventToBeReturned;
    }

    // get Event By Who
    public Events getEventByWho(String eWho){
        Events returnEvent = null;
        for (Events eve : event){
            if (eve.getWho() == eWho){
                returnEvent = eve;
                System.out.println("Event Id: " + eve.getEventId());
                System.out.println("Event by Who: " + eve.getWho());
                System.out.println("Event Start date: " + eve.getStartDate() );
                System.out.println("Event Start date: " + eve.getEndDate() );
                //System.out.println("Event Type: "+ eve.getEventType());
                System.out.println("Event Description: " + eve.getDescription());
               // System.out.println("All Day Event: " + eve.isAllDayEvent());
                System.out.println("---------------------");
                break;
            }
        }
        if (returnEvent == null)
            System.out.println("Given Event with " + eWho + " not found");

        return returnEvent;
    }

}
