package testTask1;

import org.junit.Assert;
import org.junit.Test;
import task9.ActionTask9;

public class TestTask9 {
    @Test
    public void nullTestSquare(){
        ActionTask9 actionTask9=new ActionTask9();
        double actual = actionTask9.square(0);
        double expected= 0;
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void nullTestPerimeter(){
        ActionTask9 actionTask9=new ActionTask9();
        double actual = actionTask9.perimeter(0);
        double expected= 0;
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void actualTestSquare(){
        ActionTask9 actionTask9=new ActionTask9();
        double actual = actionTask9.square(10);
        double expected= 314.159265358;
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void actualTestPerimeter(){
        ActionTask9 actionTask9=new ActionTask9();
        double actual = actionTask9.perimeter(10);
        double expected= 62.83185307;
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void negativeTestSquare(){
        ActionTask9 actionTask9=new ActionTask9();
        double actual = actionTask9.square(-10);
        double expected= 314.159265358;
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void negativeTestPerimeter(){
        ActionTask9 actionTask9=new ActionTask9();
        double actual = actionTask9.perimeter(-10);
        double expected= 62.83185307;
        Assert.assertEquals(expected, actual, 0.0001);
    }
}
