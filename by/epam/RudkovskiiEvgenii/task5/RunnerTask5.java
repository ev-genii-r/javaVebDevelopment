package task5;

import output.Output;
import scanner.Input;

public class RunnerTask5 {
    public static void main(String[] args){
        Input input=new Input();
        ActionTask5 actionTask5=new ActionTask5();
        int number=input.inputInteger();
        Output.output(actionTask5.perfectNumber(number));
    }
}
