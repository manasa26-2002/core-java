package com.xworkz.app.runner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Event implements Comparable<Event> {

      private int eventId;
      private String who;
      private String description;
      private String dob;

      @Override
      public int compareTo(Event o) {
            return this.getDescription() .compareTo(o.getDescription());
      }
}
//return this.getWho().compareTo(o.getWho())  for string type)