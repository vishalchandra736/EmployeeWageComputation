package com.blz.employeewagecomputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        int IS_Full_Time = 1;
        int empCheck = (int)(Math.floor(Math.random() * 10 % 2));
        if (empCheck == IS_Full_Time)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
