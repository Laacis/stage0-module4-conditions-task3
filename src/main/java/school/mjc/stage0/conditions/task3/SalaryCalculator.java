package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float taxRate = 0;

        if(salary > 20000){
            taxRate = 0.8f;
        }else if(salary > 10000){
            taxRate = 0.82f;
        }else if(salary > 0){
            taxRate = 0.85f;
        }

        if(taxRate != 0){
            System.out.println(salary*taxRate);
        }else{
            System.out.println("wrong input!");
        }
    }
}
