package org.example;

import java.time.DayOfWeek;

public class Message {
    private ITimeProvider timeProvider;

    public Message(){
        this(new TimeProvider());
    }

    public Message(ITimeProvider timeProvider){
        this.timeProvider = timeProvider;
    }

    public String getMessage(){
        DayOfWeek dayOfWeek = timeProvider.getDayOfWeek();
        int hour =  timeProvider.getHour();

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY
                || (dayOfWeek == DayOfWeek.MONDAY && hour < 8)
                || (dayOfWeek == DayOfWeek.FRIDAY && hour >= 18))
        {
            return "Bon week-end";
        }
        else
        {
            if (hour >= 8 && hour < 13)
            {
                return "Bonjour";
            }
            else if (hour >= 13 && hour < 18)
            {
                return "Bon apres-midi";
            }
            else
            {
                return"Bonsoir";
            }
        }
    }
}
