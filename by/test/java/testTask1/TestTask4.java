package testTask1;

import org.junit.Assert;
import org.junit.Test;
import task4.ActionTask4;

public class TestTask4 {
    @Test
    public void nullTest(){
        ActionTask4 actionTask4=new ActionTask4();
        boolean actual= actionTask4.moreThanTwoEven(0,0,0,0);
        boolean expected= true;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void actualTest(){
        ActionTask4 actionTask4=new ActionTask4();
        boolean actual= actionTask4.moreThanTwoEven(1,1,1,2);
        boolean expected= false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void negativeTest(){
        ActionTask4 actionTask4=new ActionTask4();
        boolean actual= actionTask4.moreThanTwoEven(-4,3,1,-2);
        boolean expected= true;
        Assert.assertEquals(expected, actual);
    }
}
