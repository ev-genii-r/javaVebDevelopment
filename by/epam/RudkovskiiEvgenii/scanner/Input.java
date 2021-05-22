package scanner;

import validator.Validator;

import java.util.Scanner;

public class Input {
    public int inputPositive(){
        Scanner scanner=new Scanner(System.in);
        int number;
        while(true){
            number=scanner.nextInt();
            if(Validator.validatePositive(number)){
                return number;
            }
        }
    }

    public int inputMonth(){
        Scanner scanner=new Scanner(System.in);
        int month;
        while (true){
            month=scanner.nextInt();
            if(Validator.validateMonth(month)){
                return month;
            }
        }
    }

    public int inputInteger(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
