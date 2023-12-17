package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        boolean isMonthNumber = month > 0 && month < 13;
        boolean isLongMonth = month == 4 || month == 6 || month == 9 || month == 11;
        byte days = 31;

        if(isLongMonth){
            days = 30;
        } else if (month == 2) {
            days = 28;
        }

        if(isMonthNumber){
            System.out.println(days);
        }else{
            System.out.println("wrong number!");
        }
    }
}
