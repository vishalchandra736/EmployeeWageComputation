package com.blz.employeewagecomputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
//        int IS_FULL_TIME = 1;
//        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHour, empWage;
        int empCheck = (int)(Math.floor(Math.random() * 10 % 3));
        switch (empCheck) {
            case 1 :
                System.out.println("Employee was work  Full-Time");
                empHour = 8;
                break;
            case 2 :
                System.out.println("Employee was work Part-Time");
                empHour = 4;
                break;
            default :
                System.out.println("Employee was Absent");
                empHour = 0;
        }
        empWage = EMP_RATE_PER_HOUR * empHour;
        System.out.println("Employee Daily Wage : " + empWage);
    }
}
