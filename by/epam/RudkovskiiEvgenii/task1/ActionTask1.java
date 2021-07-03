package task1;

public class ActionTask1 {

    public int getSquareLustNumber(int number){
        int lustNumber=getLustNumber(number);
        return (lustNumber*lustNumber)%10;
    }

    private int getLustNumber(int number){
        return number%10;
    }
}
