package com.xworkz.calenderapp.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Event {

    private int id;
    private String who;
    private String description;
    private boolean isAllDayEvent;
    private String startDate;
    private  String endDate;
    private EventType eventType;

}
