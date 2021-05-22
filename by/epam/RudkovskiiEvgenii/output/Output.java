package output;

import task10.EntityTask10;
import task7.EntityTask7;

import java.util.ArrayList;

public class Output {
    public static void output(int number){
        System.out.println("#######");
        System.out.println(number);
    }
    public static void output(boolean number){
        System.out.println("#######");
        System.out.println(number);
    }
    public static void output(int[] array){
        System.out.println("#######");
        System.out.println(array[0]+":"+array[1]+":"+array[2]);
    }
    public static void output(double number){
        System.out.println("#######");
        System.out.println(number);
    }
    public static void output(double number1,double number2){
        System.out.println("#######");
        System.out.println(number1);
        System.out.println("#######");
        System.out.println(number2);
    }
    public static void output(EntityTask7 dot){
        System.out.println("#######");
        System.out.println(dot.getX());
        System.out.println("#######");
        System.out.println(dot.getY());
    }
    public static void output(ArrayList<EntityTask10> list){
        for(int i=0;i<list.size();i++){
            System.out.println("##################");
            System.out.println(list.get(i).getX()+"#"+list.get(i).getY());
        }
    }
}
