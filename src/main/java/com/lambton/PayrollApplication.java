package com.lambton;

public class PayrollApplication {
    public static void main(String[] args) {
        Employee e1 = EmployeFactory.employeeType(Constants.TYPE_COMISSION_EMPLOYEE, "Parikshit", 36);
        ((ComissionBasedPartTime) e1).setVehicle(1, "Bullet", "RJ-14-CD-2001");

    }
}
