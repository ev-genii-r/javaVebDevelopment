package task2;

import output.Output;
import scanner.Input;


public class RunnerTask2 {
    public static void main(String[] args){
        Input input=new Input();
        ActionTask2 actionTask2=new ActionTask2();
        int month=input.inputMonth();
        int year=input.inputPositive();
        Output.output(actionTask2.daysInMonth(year,month));
    }
}
