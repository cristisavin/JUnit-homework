package ro.sci.testing;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConversionTest {
    TemperatureConversion t = new TemperatureConversion();

    //test with temperature < 0
    @Test
    public void temperatureAMinus() {
        int res = t.temperature(-1);
        Assert.assertEquals(res, -18);
    }

    //test with temperature = 0
    @Test
    public void temperatureZero() {
        int res = t.temperature(0);
        Assert.assertNotEquals(res, 1);
//or:   Assert.assertFalse(false);
    }

    //test with temperature > 0
    @Test
    public void temperatureAPlus() {
        int res = t.temperature(100);
        Assert.assertEquals(res, 37);
    }
}
