package com.xworkz.calender.calender;

import com.xworkz.calender.events.Events;

import java.util.Arrays;

public class Calender {

Events events[] = new Events[2];
int index;

      //non-static method
    public boolean addEvent(Events events){
        boolean isAdded = false;
        if(events.getEventId()!=0 && events.getWho() !=null &&
                events.getDescription() != null &&
                events.getStartDate() != null && events.getEndDate() != null)
        {
            this.events[index++] = events;
            isAdded = true;
        }
        return isAdded;
    }

   public void getAllEvent(){
       System.out.println("list");
       for(Events events:events){
           System.out.println("event id" +events.getEventId() + " " +"who:"+events.getWho() + " "
                       +"start date:"+events.getStartDate()
                     + " " +"end date :"+events.getEndDate() + " " +"description :"
                    +events.getDescription() + " " +"is all day event" +events.isAllDayEvent());

       }

   }
//   public Events getEventById(int eventId){
//        Events eventToBeReturned = null;
//       //System.out.println("inside geteventbyId");
//       for(Events eventsAny:events){
//           if(eventsAny!=null && eventsAny.getEventId()==eventId){
//              // eventToBeReturned = events;
//       }
//       System.out.println("end of get event by id");
//       System.out.println("-----------------------");
//       return eventToBeReturned;
//   }

//   public Events getEventByWho(String who){
//        Events eventToBeReturned = null;
//       System.out.println("start of getEventByWho");
//       for(Events events : events){
//           if(events.getWho()==who)
//               eventToBeReturned = events;
//       }
//       System.out.println("end of get event by who");
//       return eventToBeReturned;
//   }
//   public String getDescriptionById(int id){
//        String description = null;
//       System.out.println("inside getDecriptonById");
//       for(Events events : events){
//          if(events.getDescription()==description){
//              description = events.getDescription();
//           }
//       }
//       System.out.println("end of getDescriptionById");
//       return description;
//   }
//   public String getStartDateByWho(String startDate){
//        String who = null;
//       System.out.println("inside getWhoByStartDate");
//       for(Events events : events){
//           if(events.getStartDate()==startDate){
//              who= events.getStartDate();
//           }
//       }
//       System.out.println("end of getStartDateByWho");
//       return who;
//   }
//   public boolean updateStarDateAndEndDateByWho(String who,String updatStartDate,String updateEndDate){
//        boolean isStartDateAndEndDateUpdated = false;
//        for(Events events : events){
//            if(events.getWho()==who){
//
//                events.setStartDate(updatStartDate);
//                events.setEndDate(updateEndDate);
//                isStartDateAndEndDateUpdated=true;
//            }
//        }
//        if(isStartDateAndEndDateUpdated==false){
//            System.out.println(who +"is not found");
//        }
//       return isStartDateAndEndDateUpdated;
//   }
//
//   public boolean updateStartDateByWho(String who,String updateStartDate){
//        boolean isStartDateUpdate = false;
//        for(Events events : events){
//            if(events.getWho()==who){
//
//                events.setStartDate(updateStartDate);
//                isStartDateUpdate = true;
//            }
//        }
//        if(isStartDateUpdate = false){
//            System.out.println(who +"is not found");
//        }
//        return isStartDateUpdate;
//   }
//   public boolean deleteEventById(int id){
//        boolean isEventDeleted = false;
//        int i=0;
//        for(int start=0; start<this.events.length;start++){
//            Events eventsref = events[start];
//            if(eventsref.getEventId() !=id){
//                events[i++] = events[start];
//            }
//            else{
//                isEventDeleted = true;
//            }
//        }
//        int size =i;
//        events = Arrays.copyOf(events,i);
//        return isEventDeleted;
//   }
}
//crud by using custom type