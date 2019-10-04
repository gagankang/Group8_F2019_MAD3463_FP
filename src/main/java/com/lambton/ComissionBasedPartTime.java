package com.lambton;

public class ComissionBasedPartTime extends PartTime {

    private int mComissionPerc;
    //Constructor
    public ComissionBasedPartTime(String mName, int mAge) {
        super(mName, mAge);
    }
    public void setRates(int nRate,int nHours,int mCommission)
    {

        //Set the rates
        this.setRate(nRate);
        this.setHoursWorked(nHours);
        this.mComissionPerc=mCommission;
    }
