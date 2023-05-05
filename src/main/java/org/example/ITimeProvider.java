package org.example;

import java.time.DayOfWeek;

public interface ITimeProvider {
    DayOfWeek getDayOfWeek();
    int getHour();
}
