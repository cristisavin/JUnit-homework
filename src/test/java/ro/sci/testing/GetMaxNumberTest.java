package ro.sci.testing;

import org.junit.Assert;
import org.junit.Test;

public class GetMaxNumberTest {
    GetMaxNumber m = new GetMaxNumber();

    //test with first number bigger than second number
    @Test
    public void getMaxABiggest() {
        int res = m.getMax(3, 2);
        Assert.assertEquals(res, 3);
    }

    //test with second number bigger than first number
    @Test
    public void getMaxBBiggest() {
        Assert.assertEquals(m.getMax(2, 3), 3);
    }

    //test with first number equal to second number
    @Test
    public void getMaxAEqualsB() {
        int res = m.getMax(3, 3);
        Assert.assertEquals(res, 3);
    }

    //test with first number < 0 and second > 0
    @Test
    public void getMaxAMinus() {
        int res = m.getMax(-3, 3);
        Assert.assertEquals(res, 3);
    }

    //test with second number < 0 and first > 0
    @Test
    public void getMaxBMinus() {
        int res = m.getMax(3, -3);
        Assert.assertEquals(res, 3);
    }

    //test with both numbers < 0
    @Test
    public void getMaxABMinus() {
        int res = m.getMax(-3, -3);
        Assert.assertEquals(res, -3);
    }

    //test with both numbers > 0
    @Test
    public void getMaxABPlus() {
        int res = m.getMax(5, 7);
        Assert.assertEquals(res, 7);
    }

    //test with first number = 0
    @Test
    public void getMaxAZero() {
        int res = m.getMax(0, 2);
        Assert.assertEquals(res, 2);
    }

    //test with second number = 0
    @Test
    public void getMaxBZero() {
        int res = m.getMax(2, 0);
        Assert.assertEquals(res, 2);
    }
}
