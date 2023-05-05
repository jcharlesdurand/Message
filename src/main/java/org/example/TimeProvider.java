package org.example;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class TimeProvider implements ITimeProvider {

    @Override
    public DayOfWeek getDayOfWeek() {
        return LocalDateTime.now().getDayOfWeek();
    }

    @Override
    public int getHour() {
        return LocalDateTime.now().getHour();
    }
}
