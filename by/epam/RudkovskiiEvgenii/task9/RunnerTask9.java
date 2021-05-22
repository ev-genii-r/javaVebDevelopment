package task9;

import output.Output;
import scanner.Input;

public class RunnerTask9 {
    public static void main(String[] args){
        Input input=new Input();
        ActionTask9 actionTask9=new ActionTask9();
        int radius=input.inputPositive();
        Output.output(actionTask9.square(radius),actionTask9.perimeter(radius));
    }
}
