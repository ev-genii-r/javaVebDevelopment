package task10;

import java.util.ArrayList;

public class ActionTask10 {
    public ArrayList tanFunction(int firstBorder, int secondBorder, int step){
        if(firstBorder>=secondBorder){
            return null;
        }
        if(step<=0){
            return null;
        }
        int x=firstBorder;
        ArrayList<EntityTask10> matrix=new ArrayList<EntityTask10>();
        EntityTask10 entityTask10=new EntityTask10();
        double function;
        while(true){
            function=Math.tan(x);
            entityTask10=new EntityTask10();
            entityTask10.setX(x);
            entityTask10.setY(function);
            matrix.add(entityTask10);
            x+=step;
            if(x>secondBorder){
                break;
            }
        }
        return matrix;
    }
}
