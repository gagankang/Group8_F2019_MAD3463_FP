package com.lambton;

public  class Car extends Vehicle {

     private String model;
    public Car(String mMake, String mPlate) {
        super(mMake, mPlate);
    }

    @Override
    public void printMyData() {
        System.out.println("Employee has a Car");
        super.printMyData();
    }
}

