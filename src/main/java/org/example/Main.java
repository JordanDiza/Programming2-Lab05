package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        SmartDevice d1 = new SmartPhone("Apple", "iPhone");
        SmartDevice d2 = new SmartSpeaker("Google", "Nest");

        SmartPhone phone = new SmartPhone("Apple", "iPhone");
        SmartSpeaker speaker = new SmartSpeaker("Google", "Nest");

        d1.showBasicInfo();
        d1.performMainAction();
        phone.makeCall();

        d2.showBasicInfo();
        d2.performMainAction();
        speaker.playMusic();

        testCharging(phone);
        //testCharging(speaker);

    }
    public static void testCharging(Chargeable device){
        device.charge();

        // Because the class SmartPhone implements chargeable.

        // Smart speaker does not implement chargeable so it doesnt work.
    }
}
