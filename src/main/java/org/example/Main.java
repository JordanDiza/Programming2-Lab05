package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        SmartDevice d1 = new SmartPhone("Apple", "iPhone");
        SmartDevice d2 = new SmartSpeaker("Google", "Nest");

        d1.showBasicInfo();
        d1.performMainAction();

        d2.showBasicInfo();
        d2.performMainAction();
    }
}
