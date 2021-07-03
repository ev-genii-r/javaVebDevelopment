package task3;

public class ActionTask3 {

    public double findSecondSquareArea(int squareArea){
        if(squareArea<0){
            squareArea*=-1;
        }
        return (double)squareArea/2;
    }
    public int ratioOfSquares(int firstSquare,double secondSquare){
        if(firstSquare<0){
            firstSquare*=-1;
        }
        if(secondSquare<0){
            secondSquare*=-1;
        }
        return ((int) (firstSquare/secondSquare));
    }
}
