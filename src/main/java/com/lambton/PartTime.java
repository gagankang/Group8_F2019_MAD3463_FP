package com.lambton;

public abstract class PartTime extends Employee{

    private int mRate;
    private int mHoursWorked;
    private int mType;
    //COnstructor
    PartTime(String mName, int mAge ) {
        super(mName,mAge);
       // this.mRate=mRate;
        //this.mHoursWorked=mHoursWorked;
    }

    public int getRate()
    {
        return mRate;
    }
    public int getHoursWorked(){
        return mHoursWorked;
    }

    public void setRate(int mRate)
    {
        this.mRate= mRate;
    }

    public void setHoursWorked(int mHoursWorked){
        this.mHoursWorked=mHoursWorked;
    }






