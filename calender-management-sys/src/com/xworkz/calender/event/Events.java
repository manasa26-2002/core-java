package com.xworkz.calender.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Events {
    private int eventId;
    private String who;
    private String startDate;
    private String endDate;
    private String description;
    private boolean allDayEvent;
}
