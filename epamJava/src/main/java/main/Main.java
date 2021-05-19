package main;

import task1.LogicTask1;
import task10.LogicTask10;
import task2.LogicTask2;
import task3.LogicTask3;
import task4.LogicTask4;
import task5.LogicTask5;
import task6.LogicTask6;
import task7.LogicTask7;
import task8.LogicTask8;
import task9.LogicTask9;
import validator.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            Validator validator=new Validator();
            boolean flg=false;
            /*      task1    */
            System.out.println("task1\n input number");
            LogicTask1 logicTask1 = new LogicTask1();
            int number = scanner.nextInt();
            System.out.println(logicTask1.getSquareLustNumber(logicTask1.getLustNumber(number)));

            /*      task2    */
            System.out.println("task2\n input month and year");
            LogicTask2 logicTask2 = new LogicTask2();
            int month=0;
            int year=0;
            while (!flg) {
                month = scanner.nextInt();
                year = scanner.nextInt();
                flg = validator.validateMonthAndYear(month,year);
            }
            System.out.println(logicTask2.daysInMonth(year, month));

            /*      task3   */
            System.out.println("task3\n input square");
            LogicTask3 logicTask3 = new LogicTask3();
            int square=validator.validatePositive();
            System.out.println(logicTask3.findSecondSquareArea(square));
            System.out.println(logicTask3.ratioOfSquares(square, logicTask3.findSecondSquareArea(square)));

            /*      task4   */
            System.out.println("task4\n input number1, number2, number3, number 4");
            LogicTask4 logicTask4 = new LogicTask4();
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            int number4 = scanner.nextInt();
            logicTask4.moreThanTwoEven(number1, number2, number3, number4);

            /*      task5   */
            System.out.println("task5\n input number");
            LogicTask5 logicTask5 = new LogicTask5();
            number = scanner.nextInt();
            logicTask5.perfectNumber(number);

            /*      task6   */
            System.out.println("task6\n input second");
            LogicTask6 logicTask6 = new LogicTask6();
            int second=validator.validatePositive();
            System.out.println(logicTask6.second(second));

            /*      task7   */
            System.out.println("task7\n input x1,y1,x2,y2");
            LogicTask7 logicTask7 = new LogicTask7();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            logicTask7.distanceOfDots(x1, y1, x2, y2);

            /*      task8   */
            System.out.println("task8\n input x");
            LogicTask8 logicTask8 = new LogicTask8();
            int x = scanner.nextInt();
            logicTask8.functionResult(x);

            /*      task9   */
            System.out.println("task9\n input radius");
            LogicTask9 logicTask9 = new LogicTask9();
            int radius=validator.validatePositive();
            logicTask9.squarePerimeter(radius);

            /*      task10  */
            System.out.println("task10\n input first border, second border, step");
            LogicTask10 logicTask10 = new LogicTask10();
            int firstBorder = scanner.nextInt();
            int secondBorder = scanner.nextInt();
            int step = validator.validatePositive();
            logicTask10.tanFunction(firstBorder, secondBorder, step);
        }catch (Exception ex){
            System.out.println("incorrect input");
        }
    }
}
