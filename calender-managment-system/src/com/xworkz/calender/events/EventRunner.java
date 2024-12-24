package com.xworkz.calender.events;

import com.xworkz.calender.calender.Calender;

public class EventRunner {
    public static void main(String[] args) {
        Events e1 = new Events();
        e1.setEventId(45);
        e1.setWho("mansa");
        e1.setAllDayEvent(true);
        e1.setStartDate("22/11/2024");
        e1.setEndDate("24/11/2024");
        e1.setDescription("travel");


        Events ev = new Events();
        ev.setEventId(2);
        ev.setWho("akshay");
        ev.setAllDayEvent(false);
        ev.setStartDate("25/11/2024");
        ev.setEndDate("28/11/2024");
        ev.setDescription("taking leave for family function");

//        Calender calender1 = new Calender();
//        calender1.addEvent(ev);

//        Events e2 = new Events();
//        e2.setEventId(22);
//        e2.setWho("akash");
//        e2.setAllDayEvent(false);
//        e2.setStartDate("28/11/2024");
//        e2.setEndDate("29/11/2024");
//        e2.setDescription("taking leave for friends birthday");
//
////        Calender calender2 = new Calender();
////        calender2.addEvent(e2);
//
//        Events e3 = new Events();
//        e3.setEventId(213);
//        e3.setWho("akshatha");
//        e3.setAllDayEvent(false);
//        e3.setStartDate("28/10/2024");
//        e3.setEndDate("29/10/2024");
//        e2.setDescription("taking leave for friends birthday");
//
////        Calender c2 = new Calender();
////        c2.addEvent(e3);
//
//        Events e4 = new Events();
//        e4.setEventId(3);
//        e4.setWho("adithi");
//        e4.setAllDayEvent(true);
//        e4.setStartDate("10/10/2024");
//        e4.setEndDate("14/10/2024");
//        e4.setDescription("taking leave for vacation ");
//
////        Calender c3 = new Calender();
////        c3.addEvent(e4);
//
//        Events e5 = new Events();
//        e5.setEventId(42);
//        e5.setWho("asha");
//        e5.setAllDayEvent(false);
//        e5.setStartDate("01/10/2024");
//        e5.setEndDate("04/10/2024");
//        e5.setDescription("taking leave for family function ");
//
////        Calender calender3 = new Calender();
////        calender3.addEvent(e5);
//
//        Events e6 = new Events();
//        e6.setEventId(32);
//        e6.setWho("advithi");
//        e6.setAllDayEvent(true);
//        e6.setStartDate("10/10/2024");
//        e6.setEndDate("14/10/2024");
//        e6.setDescription("taking leave for vacation");
//
////        Calender c5 = new Calender();
////        c5.addEvent(e6);
//
//        Events e7 = new Events();
//        e7.setEventId(32);
//        e7.setWho("ashwini");
//        e7.setAllDayEvent(false);
//        e7.setStartDate("16/10/2024");
//        e7.setEndDate("19/10/2024");
//        e7.setDescription("taking leave for birthday celebration");
//
////        Calender d1 = new Calender();
////        d1.addEvent(e7);
//
//        Events er = new Events();
//        er.setEventId(12);
//        er.setWho("aishu");
//        er.setAllDayEvent(false);
//        er.setStartDate("16/12/2024");
//        er.setEndDate("19/12/2024");
//        er.setDescription("taking leave for vacation ");
//
////        Calender d2 = new Calender();
////        d2.addEvent(er);
//
//        Events e9 = new Events();
//        e9.setEventId(32);
//        e9.setWho("kushi");
//        e9.setAllDayEvent(true);
//        e9.setStartDate("16/11/2024");
//        e9.setEndDate("19/11/2024");
//        e9.setDescription("taking leave for neice birthday celebration");
//
//       // Calender d3 = new Calender();
//        //d3.addEvent(e9);
//
////        Calender calender = new Calender();
////        calender.addEvent(e1);
//
//
//
//        System.out.println("event Id is:"+e1.getEventId());
//        System.out.println("name is:"+e1.getWho());
//        System.out.println("event startdate is:"+e1.getStartDate());
//        System.out.println("event enddate is:"+e1.getEndDate());
//        System.out.println("event description is:"+e1.getDescription());
//        System.out.println("is all day event:"+e1.isAllDayEvent());
//
//
//        System.out.println("event Id is:"+ev.getEventId());
//        System.out.println("name is:"+ev.getWho());
//        System.out.println("event startdate is:"+ev.getStartDate());
//        System.out.println("event enddate is:"+ev.getEndDate());
//        System.out.println("event description is:"+ev.getDescription());
//        System.out.println("is all day event:"+ev.isAllDayEvent());
//
//        System.out.println("event Id is:"+e2.getEventId());
//        System.out.println("name is:"+e2.getWho());
//        System.out.println("event startdate is:"+e2.getStartDate());
//        System.out.println("event enddate is:"+e2.getEndDate());
//        System.out.println("event description is:"+e2.getDescription());
//        System.out.println("is all day event:"+e2.isAllDayEvent());
//
//
//        System.out.println("event Id is:"+e3.getEventId());
//        System.out.println("name is:"+e3.getWho());
//        System.out.println("event startdate is:"+e3.getStartDate());
//        System.out.println("event enddate is:"+e3.getEndDate());
//        System.out.println("event description is:"+e3.getDescription());
//        System.out.println("is all day event:"+e3.isAllDayEvent());
//
//        System.out.println("event Id is:"+e4.getEventId());
//        System.out.println("name is:"+e4.getWho());
//        System.out.println("event startdate is:"+e4.getStartDate());
//        System.out.println("event enddate is:"+e4.getEndDate());
//        System.out.println("event description is:"+e4.getDescription());
//        System.out.println("is all day event:"+e4.isAllDayEvent());
//
//        System.out.println("event Id is:"+e5.getEventId());
//        System.out.println("name is:"+e5.getWho());
//        System.out.println("event startdate is:"+e5.getStartDate());
//        System.out.println("event enddate is:"+e5.getEndDate());
//        System.out.println("event description is:"+e5.getDescription());
//        System.out.println("is all day event:"+e5.isAllDayEvent());
//
//        System.out.println("event Id is:"+e6.getEventId());
//        System.out.println("name is:"+e6.getWho());
//        System.out.println("event startdate is:"+e6.getStartDate());
//        System.out.println("event enddate is:"+e6.getEndDate());
//        System.out.println("event description is:"+e6.getDescription());
//        System.out.println("is all day event:"+e6.isAllDayEvent());
//
//        System.out.println("event Id is:"+e7.getEventId());
//        System.out.println("name is:"+e6.getWho());
//        System.out.println("event startdate is:"+e6.getStartDate());
//        System.out.println("event enddate is:"+e6.getEndDate());
//        System.out.println("event description is:"+e6.getDescription());
//        System.out.println("is all day event:"+e6.isAllDayEvent());
//
//        System.out.println("event Id is:"+er.getEventId());
//        System.out.println("name is:"+er.getWho());
//        System.out.println("event startdate is:"+er.getStartDate());
//        System.out.println("event enddate is:"+er.getEndDate());
//        System.out.println("event description is:"+er.getDescription());
//        System.out.println("is all day event:"+er.isAllDayEvent());
//
//        System.out.println("event Id is:"+e9.getEventId());
//        System.out.println("name is:"+e9.getWho());
//        System.out.println("event startdate is:"+e9.getStartDate());
//        System.out.println("event enddate is:"+e9.getEndDate());
//        System.out.println("event description is:"+e9.getDescription());
//        System.out.println("is all day event:"+e9.isAllDayEvent());

//       Events e3 = new Events();
//        e3.setEndDate("24/11/2024");
//        System.out.println("end date is:"+e3.getEndDate());
//
//        Events e4 = new Events();
//        e4.setWho("Mansa");
//        System.out.println("employee name is:"+e4.getWho());
//
//        Events e5 = new Events();
//        e5.setAllDayEvent(false);
//        System.out.println("all day event is:"+e5.isAllDayEvent());
//
//        Events e6 = new Events();
//        e6.setDescription("travel");
//        System.out.println("description:"+e6.getDescription());

//        Calender calender1 = new Calender();
//        calender1.addEvent(e5);
//        calender1.getAllEvent();
//        calender1.getEventById(32);
//        calender1.getStartDateByWho("16/12/2024");
//        calender1.getDescriptionById(12);
//
//        boolean startDateUpdated = calender1.updateStartDateByWho("mansa","24/11/2024" );
//        System.out.println("startDate updated");
//        calender1.getAllEvent();
//
//        calender1.deleteEventById(2);
//        calender1.getAllEvent();

    }
}
