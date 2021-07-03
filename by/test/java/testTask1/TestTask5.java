package testTask1;

import org.junit.Assert;
import org.junit.Test;
import task5.ActionTask5;

public class TestTask5 {
    @Test
    public void nullTest(){
        ActionTask5 actionTask5=new ActionTask5();
        boolean actual=actionTask5.perfectNumber(0);
        boolean expected= true;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void actualTest(){
        ActionTask5 actionTask5=new ActionTask5();
        boolean actual=actionTask5.perfectNumber(9);
        boolean expected= false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void negativeTest(){
        ActionTask5 actionTask5=new ActionTask5();
        boolean actual=actionTask5.perfectNumber(-6);
        boolean expected= true;
        Assert.assertEquals(expected,actual);
    }
}
