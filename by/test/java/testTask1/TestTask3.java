package testTask1;

import org.junit.Assert;
import org.junit.Test;
import task3.ActionTask3;

public class TestTask3 {
    @Test
    public void nullTestRatio(){
        ActionTask3 actionTask3=new ActionTask3();
        int actual= actionTask3.ratioOfSquares(0,0.0);
        int expected= 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void actualTestRatio(){
        ActionTask3 actionTask3=new ActionTask3();
        int actual= actionTask3.ratioOfSquares(2,0.5);
        int expected= 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void negativeTestRatio(){
        ActionTask3 actionTask3=new ActionTask3();
        int actual= actionTask3.ratioOfSquares(-2,0.5);
        int expected= 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void nullTestFindSecondSquareArea(){
        ActionTask3 actionTask3=new ActionTask3();
        double actual= actionTask3.findSecondSquareArea(0);
        double expected= 0;
        Assert.assertEquals(actual,expected, 0.0001);
    }

    @Test
    public void actualTestFindSecondSquareArea(){
        ActionTask3 actionTask3=new ActionTask3();
        double actual= actionTask3.findSecondSquareArea(28);
        double expected= 14;
        Assert.assertEquals(actual,expected, 0.0001);
    }

    @Test
    public void negativeTestFindSecondSquareArea(){
        ActionTask3 actionTask3=new ActionTask3();
        double actual= actionTask3.findSecondSquareArea(-44);
        double expected= 22;
        Assert.assertEquals(actual,expected, 0.0001);
    }
}
