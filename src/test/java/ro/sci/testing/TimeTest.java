package ro.sci.testing;

import org.junit.Assert;
import org.junit.Test;

public class TimeTest {
    Time t = new Time();

    // test with hour = 0 and minutes = 0
    @Test
    public void timeHHAndMMZero() {
        String res = t.time(0, 0);
        Assert.assertTrue(res, true);
    }

    // test with hour < 0 and minutes = 0
    @Test
    public void timeHHMinusAndMMZero() {
        String res = t.time(-5, 0);
        Assert.assertFalse(res, false);
    }

    // test with hour = 0 and minutes < 0
    @Test
    public void timeHHZeroAndMMMinus() {
        String res = t.time(0, -5);
        Assert.assertFalse(res, false);
    }

    // test with hour > 0 && < 24 and minutes > 0 && < 60
    @Test
    public void correctTime() {
        String res = t.time(13, 17);
        Assert.assertTrue(res, true);
    }

    // test with hour > 23 and minutes > 0 && < 60
    @Test
    public void incorrectHour() {
        String res = t.time(24, 17);
        Assert.assertFalse(res, false);
    }

    // test with hour > 0 && < 24 and minutes > 59
    @Test
    public void incorrectMinutes() {
        String res = t.time(8, 60);
        Assert.assertFalse(res, false);
    }
}
