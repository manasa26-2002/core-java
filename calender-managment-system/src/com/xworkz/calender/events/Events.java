package com.xworkz.calender.events;

import javafx.event.EventType;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Events {

    private int eventId;
    private String startDate;
    private String endDate;
    private String who;
    private boolean allDayEvent;
    private String description;
}
