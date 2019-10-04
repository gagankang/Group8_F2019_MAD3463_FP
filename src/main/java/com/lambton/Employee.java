package com.lambton;

    public abstract class Employee {
        private String mName;
        private int mAge;
        private boolean hasVehicle;
        private Vehicle mVehicle;

        Employee(String mName, int mAge) {
            //Constructor
            this.mName = mName;
            this.mAge = mAge;
        }
    }
        public  int calcBirthYear()
        {
            return 2018-mAge;
        }
        public int calcEarning()
        {
            return 1000;
        }
        public void getVehicle()
        {
            if(!hasVehicle)
            {
                System.out.println("Employee has no vehicle Registered.");
            }




        