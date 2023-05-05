package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.time.DayOfWeek;

public class MessageTest {
    @Test
    public void TimeTest_Bonjour() {
        //Given
        FakeTimeProvider fakeTimeProvider = new FakeTimeProvider(DayOfWeek.MONDAY, 10);
        Message target = new Message(fakeTimeProvider);

        //When
        String result = target.getMessage();

        //Then
        Assertions.assertEquals("Bonjour", result);
    }

    @Test
    public void TimeTest_Bonjour_withMock() {
        //Given
        ITimeProvider mockTimeProvider = mock(ITimeProvider.class);
        when(mockTimeProvider.getDayOfWeek()).thenReturn(DayOfWeek.MONDAY);
        when(mockTimeProvider.getHour()).thenReturn(10);
        Message target = new Message(mockTimeProvider);

        //When
        String result = target.getMessage();

        //Then
        Assertions.assertEquals("Bonjour", result);
        verify(mockTimeProvider).getDayOfWeek();
        verify(mockTimeProvider).getHour();
    }

    @Test
    public void TimeTest_Bonsoir() {
        //Given
        FakeTimeProvider fakeTimeProvider = new FakeTimeProvider(DayOfWeek.TUESDAY, 22);
        Message target = new Message(fakeTimeProvider);

        //When
        String result = target.getMessage();

        //Then
        Assertions.assertEquals("Bonsoir", result);
    }

    @Test
    public void TimeTest_Bonapresmidi() {
        //Given
        FakeTimeProvider fakeTimeProvider = new FakeTimeProvider(DayOfWeek.WEDNESDAY, 16);
        Message target = new Message(fakeTimeProvider);

        //When
        String result = target.getMessage();

        //Then
        Assertions.assertEquals("Bon apres-midi", result);
    }
}
