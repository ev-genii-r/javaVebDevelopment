package task4;

public class ActionTask4 {
    public boolean moreThanTwoEven(int number1, int number2, int number3, int number4){
        int counter=0;
        if(number1%2==0){counter++;}
        if(number2%2==0){counter++;}
        if(number3%2==0){counter++;}
        if(number4%2==0){counter++;}
        if(counter>1){
            return true;
        }else{
            return false;
        }
    }
}
