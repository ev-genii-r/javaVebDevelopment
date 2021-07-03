package testTask1;

import org.junit.Assert;
import org.junit.Test;
import task10.ActionTask10;
import task10.EntityTask10;

import java.util.ArrayList;

public class TestTask10 {

    @Test
    public void nullTest(){
        ActionTask10 actionTask10=new ActionTask10();
        ArrayList<EntityTask10> actual=actionTask10.tanFunction(0,0,0);
        ArrayList<EntityTask10> expected= null;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void actualTest(){
        ActionTask10 actionTask10=new ActionTask10();
        ArrayList<EntityTask10> matrix=actionTask10.tanFunction(1,3,1);
        double actual= matrix.get(0).getY();
        double expected= 1.5574077246;
        Assert.assertEquals(expected,actual,0.0001);
    }

    @Test
    public void negativeTest(){
        ActionTask10 actionTask10=new ActionTask10();
        ArrayList<EntityTask10> actual = actionTask10.tanFunction(1,3,-1);
        ArrayList<EntityTask10> expected = null;
        Assert.assertEquals(expected,actual);
    }
}
