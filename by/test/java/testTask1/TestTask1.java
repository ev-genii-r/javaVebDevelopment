package testTask1;

import org.junit.Assert;
import org.junit.Test;
import task1.ActionTask1;

public class TestTask1 {
    @Test
    public void nullTest(){
        ActionTask1 actionTask1=new ActionTask1();
        int actual=actionTask1.getSquareLustNumber(0);
        int expected=0;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void actualTest(){
        ActionTask1 actionTask1=new ActionTask1();
        int actual= actionTask1.getSquareLustNumber(18);
        int expected= 4;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void negativeTest(){
        ActionTask1 actionTask1=new ActionTask1();
        int actual= actionTask1.getSquareLustNumber(-18);
        int expected= 4;
        Assert.assertEquals(actual,expected);
    }
}
