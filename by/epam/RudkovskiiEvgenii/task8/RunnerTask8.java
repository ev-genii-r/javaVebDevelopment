package task8;

import output.Output;
import scanner.Input;

public class RunnerTask8 {
    public static void main(String[] args){
        Input input=new Input();
        int number=input.inputInteger();
        ActionTask8 actionTask8=new ActionTask8();
        Output.output(actionTask8.functionResult(number));
    }
}
