package task10;

public class LogicTask10 {
    public void tanFunction(int firstBorder, int secondBorder, int step){
        int x=firstBorder;
        double function;
        while(true){
            function=Math.tan(x);
            System.out.println(x+" "+function);
            x+=step;
            if(x>secondBorder){
                break;
            }
        }
    }
}
