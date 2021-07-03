package task9;

public class ActionTask9 {

    public double square(int radius){
        return (Math.PI*radius*radius);
    }
    public double perimeter(int radius){
        if(radius<0){
            radius*=-1;
        }
        return (2*Math.PI*radius);
    }
}
