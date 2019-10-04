package com.lambton;

public class EmployeFactory
{
    //FActory class here and the data
    public static Employee employeeType(int type,String nName,int mAge)
    {
        //Return employee data
        Employee employee = null;
        switch (type)
        {
            case Constants.TYPE_COMISSION_EMPLOYEE:
                employee = new ComissionBasedPartTime(nName,mAge);
                break;
            case Constants.TYPE_FIXED_EMPLOYEE:
                employee = new FixedBasedPartTime(nName,mAge);
                break;
            case Constants.TYPE_FULLTIME_EMPLOYEE:
        }
    }
}



