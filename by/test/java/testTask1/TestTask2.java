package testTask1;

import org.junit.Assert;
import org.junit.Test;
import task2.ActionTask2;

public class TestTask2 {
    @Test
    public void nullTest(){
        ActionTask2 actionTask2=new ActionTask2();
        int actual= actionTask2.daysInMonth(0,0);
        int expected= 0;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void actualTest(){
        ActionTask2 actionTask2=new ActionTask2();
        int actual= actionTask2.daysInMonth(2000,2);
        int expected= 29;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void negativeTest(){
        ActionTask2 actionTask2=new ActionTask2();
        int actual= actionTask2.daysInMonth(-2000,-2);
        int expected= 29;
        Assert.assertEquals(actual,expected);
    }
}
