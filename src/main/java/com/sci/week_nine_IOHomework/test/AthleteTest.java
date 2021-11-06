package com.sci.week_nine_IOHomework.test;

import com.sci.week_nine_IOHomework.Athlete;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AthleteTest {

    @Test
    public void getTotalTime() {
        Athlete adi = new Athlete(10, "Adi", "RO", "1:10", "xxxxo", "xxxxo", "xxxxo");
        assertEquals(adi.getTotalTime(), 100);

    }
}