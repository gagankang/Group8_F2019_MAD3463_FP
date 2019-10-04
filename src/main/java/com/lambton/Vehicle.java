package com.lambton;


    public abstract  class Vehicle {

        private String mMake;
        private String mPlate;

        public Vehicle(String mMake,String mPlate)
        {
            this.mMake=mMake;
            this.mPlate=mPlate;
        }


        public String getMake()
        {
            return mMake;
        }

        public String getmPlate(){
            return mPlate;
        }


        }
    


