package com.lambton;
public class PayrollApplication {
    public static void main(String[] args) {
        //Create the object and pass data
        Employee e1 = EmployeFactory.employeeType(Constants.TYPE_COMISSION_EMPLOYEE, "Shiji", 22);
        ((ComissionBasedPartTime) e1).setVehicle(1, "Bullet", "RJ-14-CD-2001");
        ((ComissionBasedPartTime) e1).setRates(10, 20, 10);
        System.out.println("\n");
        Employee e2 = EmployeFactory.employeeType(Constants.TYPE_FIXED_EMPLOYEE, "Raj", 24);
