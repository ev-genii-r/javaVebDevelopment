package task8;

public class ActionTask8 {
    public double functionResult(int x){
        if(x<3){
            return ((double)(1/(x*x*x-6)));
        }else {
            return ((double)-x*x+3*x+9);
        }
    }
}
