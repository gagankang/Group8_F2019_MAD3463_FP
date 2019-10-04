package com.lambton;

    public abstract class Employee {
        private String mName;
        private int mAge;
        private boolean hasVehicle;
        private Vehicle mVehicle;

        Employee(String mName, int mAge)
        {
            this.mName = mName;
            this.mAge = mAge;
        }
    }

