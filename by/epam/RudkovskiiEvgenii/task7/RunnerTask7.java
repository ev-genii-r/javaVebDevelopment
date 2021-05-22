package task7;

import output.Output;
import scanner.Input;

public class RunnerTask7 {
    public static void main(String[] args){
        Input input=new Input();
        EntityTask7 dot1=new EntityTask7();
        EntityTask7 dot2=new EntityTask7();
        ActionTask7 actionTask7=new ActionTask7();
        dot1.setX(input.inputInteger());
        dot1.setY(input.inputInteger());
        dot2.setX(input.inputInteger());
        dot2.setY(input.inputInteger());
        Output.output(actionTask7.distanceOfDots(dot1,dot2));
    }
}
