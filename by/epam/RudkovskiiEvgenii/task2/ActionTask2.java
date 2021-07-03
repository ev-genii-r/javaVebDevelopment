package task2;

public class ActionTask2 {

    public int daysInMonth(int year,int month){
        if(month<0){
            month*=-1;
        }
        switch (month){
            case 1: return 31;
            case 2: if(checkLeapYear(year)){
                        return 29;
                    }else {
                        return 28;
                    }
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }
    }

    private boolean checkLeapYear(int year){
        if(year % 100 == 0 && (year/100)%4 != 0){
            return false;
        }else if(year % 4 !=0){
            return false;
        }else {
            return true;
        }
    }
}
