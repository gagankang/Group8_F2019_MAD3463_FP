package com.lambton;

    public class Motorcycle extends Vehicle {

        public Motorcycle(String mMake, String mPlate) {
            super(mMake, mPlate);
        }

        @Override
        public void printMyData() {

            System.out.println("Employee has motorcycle");
            super.printMyData();
        }
    }


