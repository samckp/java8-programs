package edu.java8.poc;

import java.time.*;

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

        dataTime(); // different examples of datetimeLocal
        datetimeMethods();
    }

    public static void dataTime(){

        LocalDateTime dateTime = LocalDateTime.now();//returns the system date time in the default timezone.
        System.out.println("dateTime from the system is:"+dateTime);

//creates a date time with the values provided as parameters in the sequence year, month, day of the month, hour of the day, minute of the hour. The second and nano second are set to 0.
        LocalDateTime ldtm = LocalDateTime.of(2014, 3, 30, 12, 30);
        System.out.println("dateTime created by passing in year, month,day, hour, minute is:"+ldtm.toString());

//creates a date time with the values provided as parameters in the sequence year, month, day of the month, hour of the day, minute of the hour, seconds of the minute. The nano second is set to 0.
        LocalDateTime ldts = LocalDateTime.of(2014, 3, 30, 12, 30,23);
        System.out.println("dateTime created by passing in year, month,day, hour, minute, seconds is :"+ldts.toString());

//creates a date time with the values provided as parameters in the sequence year, month, day of the month, hour of the day, minute of the hour, seconds of the minute and nano second of the second.
        LocalDateTime ldtns = LocalDateTime.of(2014, 3, 30, 12, 30,23,12000);
        System.out.println("dateTime created by passing in year, month,day, hour, minute, seconds, nano seconds is :"+ldtns.toString());

//creates a date time with the values provided as parameters in the sequence year, month value from the Month enum, day of the month, hour of the day, minute of the hour. The second and nano second are set to 0.
        LocalDateTime ldtem = LocalDateTime.of(2013, Month.APRIL, 1, 12, 30);
        System.out.println("The date time object created by passing in year, month from enum, day, hour , minute is : "+ldtem.toString());

//creates a date time with the values provided as parameters in the sequence year, month value from the Month enum, day of the month, hour of the day, minute of the hour, seconds of the minute. The nano second is set to 0.
        LocalDateTime ldtes = LocalDateTime.of(2013, Month.APRIL, 1, 12, 30,42);
        System.out.println("The date time object created by passing in year, month from enum, day, hour , minute,second is : "+ldtes.toString());

//creates a date time with the values provided as parameters in the sequence year, month value from the Month enum, day of the month, hour of the day, minute of the hour, seconds of the minute and nano seconds of the seconds.
        LocalDateTime ldtens = LocalDateTime.of(2013, Month.APRIL, 1, 12, 30,42,12000);
        System.out.println("The date time object created by passing in year, month from enum, day, hour , minute,seconds, ns is : "+ldtens.toString());
    }

    public static void  datetimeMethods(){

        final LocalDateTime dateTime = LocalDateTime.now();
        int dayOfMonth = dateTime.getDayOfMonth();//returns the day of the month.
        System.out.println("day Of Month is :"+dayOfMonth);
        DayOfWeek dow = dateTime.getDayOfWeek();//returns DayOfWeek enum.
        System.out.println("dow:"+dow);
        int dayOfYear = dateTime.getDayOfYear();//returns the day of the year.
        System.out.println("day Of Year is :"+dayOfYear);
        int hour = dateTime.getHour();//returns hour of the day.
        System.out.println("hour:"+hour);
        int monthValue = dateTime.getMonthValue();//returns the number of the month in the year.
        System.out.println("month of the date in number is:"+monthValue);
        Month month = dateTime.getMonth();// returns the month enum for the month of the year.
        System.out.println("month of the date is :"+month);
        int sec = dateTime.getSecond();// returns seconds field value for the date time.
        System.out.println("Seconds of the date time is:"+sec);
        int nano = dateTime.getNano(); // returns nano seconds field value for the date time.
        System.out.println("nano seconds of the date time is:"+nano);
        int year = dateTime.getYear(); // returns year field value for the date time.
        System.out.println("year of the date is :"+year);
    }
}
