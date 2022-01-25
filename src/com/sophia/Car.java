package com.sophia;

public class Car {
    //declare fields
    private String make;
    private String model;
    private int mileage;
    private float gasTankPercent;
    // Car constructor
    // Create a standard constructor for the Car class
    //Standard means it will assign the values for each field. Your constructor method should have four total parameters.
    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }



    public float getGasTankPercent() {
        return gasTankPercent;
    }

    public void setGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }


   @Override
  public String toString() {
        return this.make + " " + this.model;
       // return "Make:" + this.make+" Model:" +this.model +" Mileage: "+ this.mileage + "GasTankPercent: " + this.gasTankPercent;
    }


}
