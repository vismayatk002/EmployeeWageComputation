public class EmployeeWageComputation {

    public static void main(String[] args) {

        final int isPresent=1;
        final int fullTime=1;
        int wagePerHr=20;
        int fullDayHr=16;
        int totalHr=0;
        int totalAttendance=0;    
        int monthlyEmpWage;
        //iterate till attendace reaches 20 or hours reaches 100
        while(totalAttendance <=20 && totalHr <=100){
            int empCheck = (int)(Math.random() * 10) % 2;
            //check employee is present or absent
            switch(empCheck){    
                case isPresent  :    
                    int empType = (int)(Math.random() * 10) % 2;
                    totalAttendance++;
                    //check employee type and calculate total hours
                    switch(empType){    
                        case fullTime   : 
                            totalHr = totalHr + fullDayHr;
                        break;
                        default:
                            totalHr = totalHr + (fullDayHr/2);
                            
                    }              
                break;   
            }
        }
        System.out.println("hours : "+ totalHr);
        System.out.println("attendance: "+ totalAttendance);
        //calculte monthly wage 
        monthlyEmpWage = wagePerHr * totalHr;
        System.out.println("Monthly Wage : "+ monthlyEmpWage);
    }
}