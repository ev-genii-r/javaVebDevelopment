package validator;

public class Validator {
    public static boolean validateMonth(int month){
        if(month > 0 && month < 13){
            return true;
        }else {
            return false;
        }
    }

    public static boolean validatePositive(int number){
       if(number > 0){
           return true;
       }else{
           return false;
       }
    }
}
