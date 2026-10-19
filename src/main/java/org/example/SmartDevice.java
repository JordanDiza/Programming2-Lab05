package org.example;

public abstract class SmartDevice {
    private String brand;
    private String model;

    public SmartDevice(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel(){
        return model;
    }

    public abstract void performMainAction()

    public void showBasicInfo(){
        if(brand == null || model == null){
            System.out.println("Invalid ")
        }
        else{
            System.out.println("Brand: " + brand + "Model: " + model);
        }
    }



}