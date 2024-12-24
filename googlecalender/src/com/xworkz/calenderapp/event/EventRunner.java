package com.xworkz.calenderapp.event;

import com.xworkz.calenderapp.calender.GoogleCalender;

import java.util.Calendar;
import java.util.Scanner;

public class EventRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of event");

        int size = scanner.nextInt();

        Calendar calendar = new GoogleCalender(size);
            int i = 0;

            for(int a = 0;a<size ;a++){
                Event event = new Event();
                System.out.println("enter the event id");
                event.setId(scanner.nextInt());
                System.out.println("enter who is creating event");
                event.setWho(scanner.next());
                System.out.println("enter the description of event");
                event.setDescription(scanner.next());
                System.out.println("enter start date of event");
                event.setStartDate(scanner.next());
                System.out.println("enter the end date of event");
                event.setEndDate(scanner.next());
                System.out.println("enter is all day event");
                event.setAllDayEvent(scanner.nextBoolean());

            }

            String input = null;
//        do{
//
//                System.out.println("press 1 to get all events");
//                System.out.println("press 2 to edit start date based on person name");
//                int options = scanner.nextInt();
//                switch (options) {
//                    case 1:
//                        calendar.getDetails();
//                        break;
//
//                    case 2:
//                        System.out.println("now:enter the existing person name");
//                        String who = scanner.next();
//                        break;
//                    default:
//                        System.out.println("please provide valid options");
//                }
//                System.out.println("do you want to continue yes/no");
//                input = scanner.next();
//            }while(input.("yes"));
//
//        }
    }
}

