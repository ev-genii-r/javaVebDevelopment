package testTask1;

import org.junit.Assert;
import org.junit.Test;
import task8.ActionTask8;

public class TestTask8 {
    @Test
    public void nullTest(){
        ActionTask8 actionTask8=new ActionTask8();
        double actual=actionTask8.functionResult(0);
        double expected= -0.16666666;
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void actualTest() {
        ActionTask8 actionTask8 = new ActionTask8();
        double actual = actionTask8.functionResult(88);
        double expected = -7471.0;
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void negativeTest(){
        ActionTask8 actionTask8=new ActionTask8();
        double actual=actionTask8.functionResult(-44);
        double expected= -0.000011738;
        Assert.assertEquals(expected, actual, 0.0001);
    }
}
