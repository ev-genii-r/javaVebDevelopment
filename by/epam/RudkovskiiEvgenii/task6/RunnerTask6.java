package task6;

import output.Output;
import scanner.Input;

public class RunnerTask6 {
    public static void main(String[] args){
        Input input=new Input();
        ActionTask6 actionTask6=new ActionTask6();
        int second=input.inputPositive();
        Output.output(actionTask6.convertSecond(second));
    }
}
