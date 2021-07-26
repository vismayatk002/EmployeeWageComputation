public class EmployeeWageComputation {

    public static void main(String[] args) {

        final int isPresent=1;
        final int fullTime=1;
        int wagePerHr=20;
        int partimeHr=8;
        int fullDayHr=16;
        int dailyEmpWage;
        int empCheck = (int)(Math.random() * 10) % 2;
        //check employee is present or absent
        switch(empCheck){    
            case isPresent  :    
                int empType = (int)(Math.random() * 10) % 2;
                dailyEmpWage=wagePerHr*fullDayHr;
                //check employee type 
                switch(empType){    
                    case fullTime   : 
                        System.out.println("Employee Type : Full Time ");
                        System.out.println("Employee Wage : "+ dailyEmpWage); 
                    break;
                    default:
                        System.out.println("Employee Type : Part Time ");
                        System.out.println("Employee Wage : "+ (dailyEmpWage/2));
                }              
            break;   
            default:
                 System.out.println("Employee is Absent");
        }
    }
}