package task4;

import output.Output;
import scanner.Input;

public class RunnerTask4 {
    public static void main(String[] args){
        Input input=new Input();
        ActionTask4 actionTask4=new ActionTask4();
        int number1=input.inputPositive();
        int number2=input.inputPositive();
        int number3=input.inputPositive();
        int number4=input.inputPositive();
        Output.output(actionTask4.moreThanTwoEven(number1,number2,number3,number4));
    }
}
