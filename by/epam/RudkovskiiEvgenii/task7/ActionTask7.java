package task7;

public class ActionTask7 {
    public EntityTask7 distanceOfDots(EntityTask7 dot1, EntityTask7 dot2){
        int x1=dot1.getX(), x2=dot2.getX();
        int y1=dot1.getY(), y2=dot2.getY();
        double distance1 = Math.sqrt(x1*x1+y1*y1);
        double distance2 = Math.sqrt(x2*x2+y2*y2);
        if(distance1 < distance2){
            return dot1;
        }else if(distance1 == distance2){
            return dot1;
        }else{
            return dot2;
        }
    }
}
