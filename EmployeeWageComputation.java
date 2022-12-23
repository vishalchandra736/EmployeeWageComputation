package com.blz.employeewagecomputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        int IS_Full_Time = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHour, empWage;
        int empCheck = (int)(Math.floor(Math.random() * 10 % 3));
        if (empCheck == IS_Full_Time)
            empHour = 8;
        else if (empCheck == IS_PART_TIME)
            empHour = 4;
        else
            empHour = 0;
        empWage = EMP_RATE_PER_HOUR * empHour;
        System.out.println("Employee Daily Wage : " + empWage);
    }
}
