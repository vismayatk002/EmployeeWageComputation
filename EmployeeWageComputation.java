public class EmployeeWageComputation {

    public static void main(String[] args) {

        int ispresent=1;
        int wagePerHr=20;
        int fullDayHr=8;
        int dailyEmpWage;
        double empCheck = Math.floor (Math.random() * 10) % 2;
        
        if (empCheck == ispresent){
            dailyEmpWage=wagePerHr*fullDayHr;
            System.out.println("Daily Wage ="+ dailyEmpWage);
        }
        else{
            System.out.println("employee is absent");
        }
    }

}