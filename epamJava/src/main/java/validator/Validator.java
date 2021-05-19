package validator;

import java.util.Scanner;

public class Validator {
    public boolean validateMonthAndYear(int month, int year){
        if(month > 0 && month < 13 && year > 0){
            return true;
        }else {
            return false;
        }
    }

    public int validatePositive(){
        Scanner scanner = new Scanner(System.in);
        int number;
       while(true){
           number=scanner.nextInt();
           if(number>0){
               break;
           }
       }
       return number;
    }
}
