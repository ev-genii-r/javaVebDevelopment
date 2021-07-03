package testTask1;

import org.junit.Assert;
import org.junit.Test;
import task6.ActionTask6;

public class TestTask6 {
    @Test
    public void nullTest(){
        ActionTask6 actionTask6=new ActionTask6();
        int[] actual= actionTask6.convertSecond(0);
        int[] expected= new int[] {0, 0, 0};
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void actualTest(){
        ActionTask6 actionTask6=new ActionTask6();
        int[] actual= actionTask6.convertSecond(3601);
        int[] expected= new int[] {1, 0, 1};
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void negativeTest(){
        ActionTask6 actionTask6=new ActionTask6();
        int[] actual= actionTask6.convertSecond(-3601);
        int[] expected= new int[] {1, 0, 1};
        Assert.assertArrayEquals(expected,actual);
    }
}
