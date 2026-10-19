package org.example;

public class SmartSpeaker extends SmartDevice implements Chargeable, Connectable{
    public SmartSpeaker(String brand, String model){
        super(brand, model);
    }

    @Override
    public void performMainAction(){
        System.out.println("SmartSpeaker is playing music.");
    }

    public void playMusic(){
        System.out.println("Do Re Mi Fa Sol La Si Do");
    }

    @Override
    public void connectToWifi(){
        System.out.println("SmartSpeaker conencted to WiFi");
    }
}
