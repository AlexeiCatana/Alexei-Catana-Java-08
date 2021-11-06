package com.sci.week_nine_IOHomework.test;

import com.sci.week_nine_IOHomework.Leaderboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeaderboardTest {

    Leaderboard testLeaderboard = new Leaderboard();

    @Before
    public void setUp(){
        testLeaderboard.readAthletes();
    }

    @Test
    public void readAthletesTest() {

        assertEquals(testLeaderboard.getAthletes().size(), 3);
    }
}
