package task10;

import output.Output;
import scanner.Input;

public class RunnerTask10 {
    public static void main(String[] args){
        Input input=new Input();
        ActionTask10 actionTask10=new ActionTask10();
        int firstBorder=input.inputInteger();
        int secondBorder= input.inputInteger();
        int step= input.inputPositive();
        Output.output(actionTask10.tanFunction(firstBorder,secondBorder,step));
    }
}
