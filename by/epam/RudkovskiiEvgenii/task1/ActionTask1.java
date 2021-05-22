package task1;

public class ActionTask1 {

    public int getSquareLustNumber(int number){
        int lustNumber=getLustNumber(number);
        return (lustNumber*lustNumber)%10;
    }

    public int getLustNumber(int number){
        return number%10;
    }
}
