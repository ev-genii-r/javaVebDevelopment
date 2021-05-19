package task5;

public class LogicTask5 {
    public void perfectNumber(int number){
        int sum=0;
        if(number<0){
            number *=-1;
        }
        for(int i=1;i<=number/2;i++){
            if(number % i == 0){
                sum+=i;
            }
        }
        if(sum == number){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
