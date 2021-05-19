package task6;

public class LogicTask6 {

    public String second(int inputSecond){

        int seconds=0;
        int minuts=0;
        int hours=0;

        hours = inputSecond / 3600;
        minuts = (inputSecond % 3600)/60;
        seconds = inputSecond % 60;

        return  hours+":"+minuts+":"+seconds;
    }
}
