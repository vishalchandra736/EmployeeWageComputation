package com.blz.employeewagecomputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        int EMP_RATE_PER_HOUR = 20;
        int NUM_OF_WORKING_DAYS = 20;
        int MAX_HOURS_IN_MONTH = 100;
        int empHour = 0, monthEmpWages = 0, totalWorkingDays = 1, totalEmpHours = 0;
        while( totalWorkingDays <= NUM_OF_WORKING_DAYS && totalEmpHours <= MAX_HOURS_IN_MONTH) {
            int empCheck = (int) (Math.floor(Math.random() * 10 % 3));
            switch (empCheck) {
                case 1:
                    empHour = 8;
                    break;
                case 2:
                    empHour = 4;
                    break;
                default:
                    empHour = 0;
            }
            totalEmpHours += empHour;
            System.out.println("Day : " + totalWorkingDays + " and Employee Hour : " + empHour);
            totalWorkingDays++;
        }
        monthEmpWages = EMP_RATE_PER_HOUR * totalEmpHours;
        System.out.println("Monthly Total Employee Wages : " + monthEmpWages);
    }
}
