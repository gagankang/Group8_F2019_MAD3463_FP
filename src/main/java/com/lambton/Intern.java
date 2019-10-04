package com.lambton;

public class Intern extends Employee {
    private String mSchool;
    public Intern(String mName, int mAge) {
        super(mName,mAge);
    }
    public void setSchoolName(String mSchool){
        //Set school name
        this.mSchool=mSchool;
    }
    @Override
    public void printMyData()
    {
        //Print my data
        super.printMyData();
        System.out.println("School Name "+mSchool);
        System.out.println("Earning "+calcEarning());

    }
}




   


