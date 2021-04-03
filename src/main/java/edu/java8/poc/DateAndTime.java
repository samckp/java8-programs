package edu.java8.poc;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {

    public static void main(String[] args) {

        final Clock clock = Clock.systemUTC();

        // Get the local date
        final LocalDate date = LocalDate.now();
        final LocalDate dateFromClock = LocalDate.now( clock );

        System.out.println( date );
        System.out.println( dateFromClock );

        // Get the  local time
        final LocalTime time = LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now( clock );

        System.out.println( time );
        System.out.println( timeFromClock );

        // Get the local date/time
        final LocalDateTime datetime = LocalDateTime.now();
        final LocalDateTime datetimeFromClock = LocalDateTime.now( clock );

        System.out.println( datetime );
        System.out.println( datetimeFromClock );

    }
}
