public class EmployeeWageComputation {

    public static void main(String[] args) {

        int ispresent=1;
        int wagePerHr=20;
        int partimeHr=8;
        int fullDayHr=16;
        int fullTime=1;
        int dailyEmpWage;
        double empCheck = Math.floor (Math.random() * 10) % 2;
        //check employee is present or absent
        if (empCheck == ispresent){
            double empType = Math.floor (Math.random() * 10) % 2;
            dailyEmpWage=wagePerHr*fullDayHr;
            //check employee is full time or part time
            if(empType == fullTime){
                System.out.println("Employee Type : Full Time ");
                System.out.println("Employee Wage : "+ dailyEmpWage);
            }
            else{
                System.out.println("Employee Type : Part Time ");
                System.out.println("Employee Wage : "+ (dailyEmpWage/2));    
            }
        }
        else{
            System.out.println("Employee is Absent");
        }
    }

}