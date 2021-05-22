package task6;

public class ActionTask6 {

    public int[] convertSecond(int inputSecond){

        int seconds=0;
        int minuts=0;
        int hours=0;

        hours = inputSecond / 3600;
        minuts = (inputSecond % 3600)/60;
        seconds = inputSecond % 60;
        int[] array={hours,minuts,seconds};
        return array;
    }
}
