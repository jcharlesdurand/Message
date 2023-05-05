package org.example;

import java.time.DayOfWeek;

public class FakeTimeProvider implements  ITimeProvider{
    private int hour;
    private DayOfWeek day;

    public FakeTimeProvider(DayOfWeek day, int hour){
        this.hour = hour;
        this.day = day;
    }

    @Override
    public DayOfWeek getDayOfWeek() {
        return day;
    }

    @Override
    public int getHour() {
        return hour;
    }
}
