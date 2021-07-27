public class EmployeeWageComputation {

    public static void main(String[] args) {

        final int isPresent=1;
        final int fullTime=1;
        int wagePerHr=20;
        int partimeHr=8;
        int fullTimeHr=16;
        int workingDays=20;     
        int monthlyEmpWage;
        int totalHr=0;
       
        //check employee is present or absent
        for(int day=1; day<=workingDays; day++){
            int empCheck = (int)(Math.random() * 10) % 2;
            switch(empCheck){    
                case isPresent  :    
                    int empType = (int)(Math.random() * 10) % 2;                   
                    //check employee type 
                    switch(empType){    
                        case fullTime   : 
                            totalHr = totalHr + fullTimeHr;
                        break;
                        default:
                            totalHr = totalHr + partimeHr;
                    }              
                break;
            }
        }
        monthlyEmpWage= wagePerHr * totalHr;
        System.out.println("Monthly wage : " + monthlyEmpWage);
    }
}