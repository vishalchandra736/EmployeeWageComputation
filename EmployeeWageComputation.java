package com.blz.employeewagecomputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        int EMP_RATE_PER_HOUR = 20;
        int NUM__OF_WORKING_DAYS = 20;
        int empHour, empWage, monthEmpWages = 0;
        for(int i=0; i<NUM__OF_WORKING_DAYS; i++) {
            int empCheck = (int)(Math.floor(Math.random() * 10 % 3));
            switch (empCheck) {
                case 1 :
                    empHour = 8;
                    break;
                case 2 :
                    empHour = 4;
                    break;
                default :
                    empHour = 0;
            }
            empWage = EMP_RATE_PER_HOUR * empHour;
            monthEmpWages += empWage;
        }
        System.out.println("Monthly Total Employee Wages : " + monthEmpWages);
    }
}
