package com.xworkz.calender.event;

public class EventsRunner {
    public static void main(String[] args) {

        Events event1 = new Events();
        event1.setEventId(1);
        event1.setWho("Bhoomika");
        event1.setStartDate("19-11-2024");
        event1.setEndDate("21-11-2024");
        //event1.setEventType(EventType.LEAVE);
        event1.setDescription("Christmas");
        event1.setAllDayEvent(true);

        Events event2 = new Events();
        event2.setEventId(2);
        event2.setWho("Keerthi");
        event2.setStartDate("20-11-2024");
        event2.setEndDate("25-11-2024");
       // event2.setEventType(EventType.TRAVEL);
        event2.setDescription("Traveling to HomeTown ");
        event2.setAllDayEvent(true);

        Events event3 = new Events();
        event3.setEventId(3);
        event3.setWho("Poojitha");
        event3.setStartDate("20-11-2024");
        event3.setEndDate("20-11-2024");
       // event3.setEventType(EventType.BIRTHDAY);
        event3.setDescription("Sister's Birthday ");
        event3.setAllDayEvent(true);

        Events event4 = new Events();
        event4.setEventId(0);
        event4.setWho("Apoorva");
        //event4.setEventType(EventType.TRAVEL);
        event4.setAllDayEvent(true);

        Calender calendar = new Calender();
        calendar.addEvent(event1);
        calendar.addEvent(event2);
        calendar.addEvent(event3);
        calendar.addEvent(event4);

        calendar.getAllEvents();

        calendar.getEventById(3);
        calendar.getEventById(4);
        calendar.getEventByWho("Bhoomika");
        calendar.getEventByWho("Apoorva");


    }
}
