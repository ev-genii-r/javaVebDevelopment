package task1;

import output.Output;
import scanner.Input;

public class RunnerTask1 {
    public static void main(String[] args){
        Input input=new Input();
        ActionTask1 actionTask1=new ActionTask1();
        int number=input.inputPositive();
        Output.output(actionTask1.getSquareLustNumber(number));
    }
}
