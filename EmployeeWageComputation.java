package com.blz.employeewagecomputation;

public class EmployeeWageComputation {
    public static int checkWorkingHour() {
        int empHour;
        int empCheck = (int) (Math.floor(Math.random() * 10 % 3));
        switch (empCheck) {
            case 1:
                return empHour = 8;
            case 2:
                return empHour = 4;
            default:
                return empHour = 0;
        }
    }

    public static void main(String[] args) {
        int EMP_RATE_PER_HOUR = 20;
        int NUM_OF_WORKING_DAYS = 20;
        int MAX_HOURS_IN_MONTH = 100;
        int empHour = 0, monthEmpWages = 0, totalWorkingDays = 1, totalEmpHours = 0;
        for(int i=1; i<=NUM_OF_WORKING_DAYS && totalEmpHours <= MAX_HOURS_IN_MONTH; i++) {
        //while( totalWorkingDays <= NUM_OF_WORKING_DAYS && totalEmpHours <= MAX_HOURS_IN_MONTH) {
            empHour = checkWorkingHour();
            totalEmpHours += empHour;
            System.out.println("Day : " + totalWorkingDays + " and Employee Hour : " + empHour);
            totalWorkingDays++;
        }
        monthEmpWages = EMP_RATE_PER_HOUR * totalEmpHours;
        System.out.println("Monthly Total Employee Wages : " + monthEmpWages);
    }
}
