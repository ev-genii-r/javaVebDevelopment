package task3;

import output.Output;
import scanner.Input;

public class RunnerTask3 {
    public static void main(String[] args){
        Input input=new Input();
        ActionTask3 actionTask3=new ActionTask3();
        int squareArea=input.inputPositive();
        double secondSquareArea=actionTask3.findSecondSquareArea(squareArea);
        Output.output(secondSquareArea);
        Output.output(actionTask3.ratioOfSquares(squareArea,secondSquareArea));
    }
}
