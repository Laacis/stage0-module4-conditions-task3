package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        boolean rightNumber = month > 0 && month < 13;

        if(rightNumber){
            if(month == 12 || month < 4){
                System.out.println("Winter");
            }else if(month < 6){
                System.out.println("Spring");
            }else if(month < 9){
                System.out.println("Summer");
            }
            else{
                System.out.println("Autumn");
            }
        }else{
            System.out.println("wrong number!");
        }
    }
}
