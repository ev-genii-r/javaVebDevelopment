package testTask1;

import org.junit.Assert;
import org.junit.Test;
import task7.ActionTask7;
import task7.EntityTask7;

public class TestTask7 {
    @Test
    public void nullTest(){
        ActionTask7 actionTask7=new ActionTask7();
        EntityTask7 dot1=null;
        EntityTask7 dot2=null;
        EntityTask7 actual= actionTask7.distanceOfDots(dot1,dot2);
        EntityTask7 expected= dot1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void actualTest(){
        ActionTask7 actionTask7=new ActionTask7();
        EntityTask7 dot1=new EntityTask7();
        dot1.setY(0);
        dot1.setX(5);
        EntityTask7 dot2=new EntityTask7();
        dot2.setY(5);
        dot2.setX(10);
        EntityTask7 actual= actionTask7.distanceOfDots(dot1,dot2);
        EntityTask7 expected= dot1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void negativeTest(){
        ActionTask7 actionTask7=new ActionTask7();
        EntityTask7 dot1=new EntityTask7();
        dot1.setY(0);
        dot1.setX(-5);
        EntityTask7 dot2=new EntityTask7();
        dot2.setY(-5);
        dot2.setX(-10);
        EntityTask7 actual= actionTask7.distanceOfDots(dot1,dot2);
        EntityTask7 expected= dot1;
        Assert.assertEquals(expected,actual);
    }
}
